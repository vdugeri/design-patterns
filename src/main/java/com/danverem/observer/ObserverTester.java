package com.danverem.observer;

import com.danverem.observer.models.Message;
import com.danverem.observer.models.MessageChannel;
import com.danverem.observer.services.EmailService;
import com.danverem.observer.services.SmsService;

import java.util.List;

public class ObserverTester {
    public static void main(String[] args) {
        Notification notification = new Notification();
        SmsService smsService = new SmsService();
        EmailService emailService = new EmailService();

        new SmsObserver(notification, smsService);
        new EmailObserver(notification, emailService);

        Message email = Message
            .builder()
            .recipients(List.of("john.doe@example.com", "test.user@example.com"))
            .subject("Test email")
            .body("This is a test email")
            .channels(List.of(MessageChannel.EMAIL))
            .build();

        Message sms = Message
            .builder()
            .recipients(List.of("+2347067923577", "+2347067823578"))
            .body("This is a test sms")
            .channels(List.of(MessageChannel.SMS, MessageChannel.WHATSAPP))
            .build();

        notification.notificationReceived(email);
        notification.notificationReceived(sms);
    }
}
