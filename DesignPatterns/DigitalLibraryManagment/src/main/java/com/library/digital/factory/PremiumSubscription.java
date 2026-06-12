package com.library.digital.factory;

public class PremiumSubscription extends Subscription {

    @Override
    public int getStreamLimit() {

        return 5;
    }
}