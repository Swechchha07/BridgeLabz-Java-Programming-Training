package com.library.digital.model;

public class PdfEbook
        implements DigitalStreamResource {

    private String title;

    public PdfEbook(String title) {

        this.title = title;
    }

    @Override
    public String getTitle() {

        return title;
    }
}