package com.library.digital.factory;
public class MobileUIFactory implements PlatformUIFactory {
    @Override
    public String createButton() {
        return "TouchButton";
    }
    @Override
    public String createReader() {
        return "CompactReader";
    }
}