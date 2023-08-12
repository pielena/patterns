package com.github.pielena.patterns.facade;

public class SmsService {

    public void sendSms(String phone, String message) {
        System.out.printf("send sms to phone %s: %s\n", phone, message);
    }
}
