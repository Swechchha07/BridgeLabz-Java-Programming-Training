package com.library.digital.factory;

import com.library.digital.model.*;

public class StreamingAssetFactory {

    public static DigitalStreamResource
    createAsset(String type, String title) {

        if(type.equalsIgnoreCase("audio"))
            return new StreamingAudio(title);

        if(type.equalsIgnoreCase("pdf"))
            return new PdfEbook(title);

        throw new IllegalArgumentException("Invalid Type");
    }
}