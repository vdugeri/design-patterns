package com.danverem.observer.models;

import lombok.Builder;

import java.util.List;

@Builder
public class Email extends Message {
    public String subject;
    private List<String> recipients;
    private List<String> cc;
    private List<String> bcc;
    private String body;

    @Override
    public String getBody() {
        return this.body;
    }

    @Override
    public List<String> getRecipients() {
        return this.recipients;
    }

    public String getSubject() {
        return subject;
    }

    public List<String> getCc() {
        return cc;
    }

    public List<String> getBcc() {
        return bcc;
    }
}
