package com.danverem.observer.services;

import com.danverem.observer.models.Email;
import com.danverem.observer.models.Message;

public class EmailService {

    public void sendEmail(Message message) {
        System.out.println("Sending Email: " + message.getBody());
        System.out.println("Recipients: " + message.getRecipients());
        System.out.println("------------");
    }
}
