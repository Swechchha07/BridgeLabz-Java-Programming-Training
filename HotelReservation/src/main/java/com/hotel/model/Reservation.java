package com.hotel.model;

public class Reservation {

    private String reservationId;
    private String guestName;
    private int roomNumber;
    private int nights;
    private double totalAmount;
    private String status;

    public Reservation() {
    }

    public Reservation(String reservationId, String guestName, int roomNumber, int nights, double totalAmount, String status) {

        this.reservationId = reservationId;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.nights = nights;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public String getReservationId() {

        return reservationId;
    }

    public String getGuestName() {

        return guestName;
    }

    public int getRoomNumber() {

        return roomNumber;
    }

    public int getNights() {

        return nights;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }
}