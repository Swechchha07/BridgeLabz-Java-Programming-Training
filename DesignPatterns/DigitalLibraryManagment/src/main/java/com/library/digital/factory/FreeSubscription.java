package com.library.digital.factory;

public class FreeSubscription extends Subscription {

    @Override
    public int getStreamLimit() {

        return 1;
    }
}