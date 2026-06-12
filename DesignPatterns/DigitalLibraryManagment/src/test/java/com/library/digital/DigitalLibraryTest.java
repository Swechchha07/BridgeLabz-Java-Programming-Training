package com.library.digital;
import com.library.digital.factory.*;
import com.library.digital.config.CloudServerConfig;
import org.junit.jupiter.api.Test;
import com.library.digital.decorator.*;
import com.library.digital.model.*;
import com.library.digital.observer.*;


import static org.junit.jupiter.api.Assertions.*;

public class DigitalLibraryTest {

    @Test
    void testSingleton() {
        CloudServerConfig config1 = CloudServerConfig.getInstance();

        CloudServerConfig config2 = CloudServerConfig.getInstance();
        assertSame(config1, config2);
        assertEquals("https://cdn.elend-library.io", config1.getCdnGatewayUrl());
    }
    @Test
    void testStreamingAssetFactory() {
        DigitalStreamResource asset = StreamingAssetFactory.createAsset("audio", "Java Basics");
        assertEquals("Java Basics", asset.getTitle());
        assertThrows(IllegalArgumentException.class, () -> StreamingAssetFactory.createAsset("invalid", "Book"));
    }
    @Test
    void testSubscriptionFactoryMethod() {

        SubscriptionCreator freeCreator = new FreeTierCreator();
        SubscriptionCreator premiumCreator = new PremiumTierCreator();
        Subscription freeSubscription = freeCreator.createSubscription();
        Subscription premiumSubscription = premiumCreator.createSubscription();
        assertEquals(1, freeSubscription.getStreamLimit());
        assertEquals(5, premiumSubscription.getStreamLimit()
        );
    }
    @Test
    void testMobileUIFactory() {
        PlatformUIFactory ui = new MobileUIFactory();
        assertEquals("TouchButton", ui.createButton());
        assertEquals("CompactReader", ui.createReader());
    }
    @Test
    void testUserProfileBuilder() {
        UserProfile user = new UserProfile.Builder()
                        .setUsername("Swechchha")
                        .setEmail("abc@gmail.com")
                        .setDevicesLimit(3)
                        .build();
        assertEquals("Swechchha", user.getUsername());
        assertEquals("abc@gmail.com", user.getEmail());
        assertEquals(3, user.getDevicesLimit());
    }


    @Test
    void testDecorator() {
        ReaderView view = new NightModeDecorator(new BaseReader());
        assertEquals("Text + NightMode", view.draw());
    }

    @Test
    void testObserver() {
        Subject subject = new Subject();
        SubscriberObserver observer = new SubscriberObserver();
        subject.addObserver(observer);
        subject.publishUpdate("Book Removed");
        assertEquals("Book Removed", observer.getLastUpdate());
    }

}