package com.library.digital.factory;

public class PremiumTierCreator extends SubscriptionCreator {

    @Override
    public Subscription createSubscription() {
        return new PremiumSubscription();
    }
}
