package com.library.digital.decorator;

public class NightModeDecorator implements ReaderView {
    private ReaderView decorated;
    public NightModeDecorator(ReaderView decorated) {
        this.decorated = decorated;
    }

    @Override
    public String draw() {
        return decorated.draw() + " + NightMode";
    }
}