package com.danverem.observer.models;

import lombok.Builder;

import java.util.List;

@Builder
public class Message {
    private String body;
    private List<String> recipients;
    private List<MessageChannel> channels;
    private String subject;


    public String getBody() {
        return body;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public List<MessageChannel> getChannels() {
        return channels;
    }

    public String getSubject() {
        return subject;
    }
}
