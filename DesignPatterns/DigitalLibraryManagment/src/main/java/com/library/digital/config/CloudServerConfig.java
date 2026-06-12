package com.library.digital.config;
    public class CloudServerConfig {
    private static CloudServerConfig instance;
    private String cdnGatewayUrl = "https://cdn.elend-library.io";
    private CloudServerConfig() {}

    public static CloudServerConfig getInstance() {
        if(instance == null) {
            instance = new CloudServerConfig();
        }
        return instance;
    }

    public String getCdnGatewayUrl() {
        return cdnGatewayUrl;
    }
}