package com.danverem.observer;

import com.danverem.observer.models.Message;

import java.util.ArrayList;
import java.util.List;

public class Notification implements Observable {
    public List<Observer> observers;
    public Message message;

    public Notification() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(this);
        }
    }

    public void notificationReceived(Message message) {
        this.message = message;
        this.notifyObservers();
    }


}
