package com.danverem.observer;

import com.danverem.observer.models.Message;
import com.danverem.observer.models.MessageChannel;
import com.danverem.observer.services.SmsService;

public class SmsObserver implements Observer {
    private final Observable observable;
    private final SmsService smsService;

    public SmsObserver(Observable observable, SmsService smsService) {
        this.observable = observable;
        this.observable.registerObserver(this);

        this.smsService = smsService;
    }

    @Override
    public void update(Observable observable) {
        if(observable instanceof Notification notification) {
            Message message = notification.getMessage();

            if(message.getChannels().contains(MessageChannel.SMS)) {
                smsService.sendSms(message);
            }
        }
    }
}
