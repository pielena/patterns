package com.github.pielena.patterns.facade;

public class PushNotifyService {

    public void sendPersonal(String clientToken, String message) {
        System.out.printf("Send push notification to token %s: %s\n", clientToken,message);
    }
}
