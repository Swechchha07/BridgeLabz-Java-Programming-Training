package com.hotel.threads;

import com.hotel.model.Reservation;

public class PaymentProcessor extends Thread {
    private Reservation reservation;
    public PaymentProcessor(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public void run() {

        try {
            System.out.println("Payment Processing For : " + reservation.getGuestName());
            Thread.sleep(150);

            reservation.setStatus("Paid");

            System.out.println("Payment Successful");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}