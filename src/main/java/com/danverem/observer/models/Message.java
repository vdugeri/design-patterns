package com.danverem.observer.models;

import java.util.List;

public abstract class Message {
    private String body;
    private List<String> recipients;

    public abstract String getBody();

    public abstract List<String> getRecipients();
}
