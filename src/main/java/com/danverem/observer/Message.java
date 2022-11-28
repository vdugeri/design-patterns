package com.danverem.observer;

public class Message {
    public String body;
    public NotificationChannel channel;

    public Message(String body, NotificationChannel channel) {
        this.body = body;
        this.channel = channel;
    }
}
