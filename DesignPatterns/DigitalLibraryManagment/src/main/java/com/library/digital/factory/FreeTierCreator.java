package com.library.digital.factory;

public class FreeTierCreator extends SubscriptionCreator {

    @Override
    public Subscription createSubscription() {
        return new FreeSubscription();
    }
}
