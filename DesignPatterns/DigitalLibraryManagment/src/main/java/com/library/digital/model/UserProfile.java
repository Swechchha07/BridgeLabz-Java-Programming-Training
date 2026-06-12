package com.library.digital.model;
public class UserProfile {
    private String username;
    private String email;
    private int devicesLimit;
    public UserProfile(String username,String email, int devicesLimit) {
        this.username = username;
        this.email = email;
        this.devicesLimit = devicesLimit;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public int getDevicesLimit() {
        return devicesLimit;
    }
    public static class Builder {
        private String username;
        private String email;
        private int devicesLimit;
        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setDevicesLimit(int devicesLimit) {
            this.devicesLimit = devicesLimit;
            return this;
        }
        public UserProfile build() {
            return new UserProfile(username, email, devicesLimit);
        }
    }
}