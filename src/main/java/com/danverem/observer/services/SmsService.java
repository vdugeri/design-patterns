package com.danverem.observer.services;


import com.danverem.observer.models.Message;

public class SmsService {
    public void sendSms(Message message) {
        System.out.println("Sending SMS: " + message.getBody());
        System.out.println("Recipients: " + message.getRecipients());
    }
}
