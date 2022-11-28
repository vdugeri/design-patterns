package com.danverem.observer.models;

import lombok.Builder;

import java.util.List;

@Builder
public class Sms extends Message {
    private String body;
    private List<String> recipients;



    @Override
    public String getBody() {
        return this.body;
    }

    @Override
    public List<String> getRecipients() {
        return this.recipients;
    }
}
