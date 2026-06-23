package com.hotel.model;

public class Room {
    private int roomNumber;
    private String type;
    private double pricePerNight;
    private boolean available;

    public Room() {
    }

    public Room(int roomNumber, String type, double pricePerNight, boolean available) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.available = available;
    }

    public int getRoomNumber() {

        return roomNumber;
    }

    public String getType() {

        return type;
    }

    public double getPricePerNight() {

        return pricePerNight;
    }

    public boolean isAvailable() {

        return available;
    }

    @Override
    public String toString() {
        return roomNumber + " " + type + " " + pricePerNight + " " + available;
    }
}