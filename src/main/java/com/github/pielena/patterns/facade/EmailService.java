package com.github.pielena.patterns.facade;

public class EmailService {

    public void sendEmail(String email, String message) {
        System.out.printf("send email to address %s: %s\n", email, message);
    }
}
