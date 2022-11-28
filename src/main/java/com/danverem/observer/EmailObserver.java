package com.danverem.observer;

import com.danverem.observer.models.Message;
import com.danverem.observer.models.MessageChannel;
import com.danverem.observer.services.EmailService;

public class EmailObserver implements Observer {
    private final Observable observable;
    private final EmailService emailService;


    public EmailObserver(Observable observable, EmailService emailService) {
        this.observable = observable;
        this.emailService = emailService;
        this.observable.registerObserver(this);
    }
    @Override
    public void update(Observable observable) {
        if(observable instanceof Notification notification) {
            Message message = notification.getMessage();

            if(message.getChannels().contains(MessageChannel.EMAIL)) {
                emailService.sendEmail(message);
            }
        }
    }
}
