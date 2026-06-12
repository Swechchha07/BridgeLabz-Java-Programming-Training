package com.library.digital.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<SubscriberObserver> observers = new ArrayList<>();

    private String updateInfo;

    public void addObserver(SubscriberObserver obs) {
        observers.add(obs);
    }

    public void publishUpdate(String message) {
        updateInfo = message;
        notifyObservers();
    }

    private void notifyObservers() {
        for(SubscriberObserver obs : observers) {
            obs.update(updateInfo);
        }
    }
}