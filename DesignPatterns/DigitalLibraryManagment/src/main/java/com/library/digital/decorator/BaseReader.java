package com.library.digital.decorator;

public class BaseReader implements ReaderView {

    @Override
    public String draw() {

        return "Text";
    }
}