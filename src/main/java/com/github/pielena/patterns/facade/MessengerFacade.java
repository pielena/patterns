package com.github.pielena.patterns.facade;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class MessengerFacade {
    private final EmailService emailService;
    private final SmsService smsService;
    private final PushNotifyService pushNotifyService;

    public void sendNotifications(List<User> users, String message) {
        for (User user : users) {
            Optional.ofNullable(user.getEmail())
                    .ifPresent(email -> emailService.sendEmail(email, message));
            Optional.ofNullable(user.getPhone())
                    .ifPresent(phone -> smsService.sendSms(phone, message));
            Optional.ofNullable(user.getClientToken())
                    .ifPresent(token -> pushNotifyService.sendPersonal(token, message));
        }
    }
}
