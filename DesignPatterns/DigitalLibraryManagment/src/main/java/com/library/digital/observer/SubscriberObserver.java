package com.library.digital.observer;

public class SubscriberObserver {

    private String lastUpdate;

    public void update(String msg) {
        lastUpdate = msg;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }
}