package com.github.pielena.patterns.facade;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        SmsService smsService = new SmsService();
        PushNotifyService pushNotifyService = new PushNotifyService();
        List<User> users = new ArrayList<>();
        users.add(new User("user1", "user1@gmail.com", "112", "testToken"));
        users.add(new User("user2", "user2@gmail.com", null, null));

        MessengerFacade senderFacade = new MessengerFacade(emailService, smsService, pushNotifyService);
        senderFacade.sendNotifications(users, "Are you ready?");
    }
}
