package com.hotel.io;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hotel.model.Reservation;

import java.io.File;

public class JsonHandler {

    private static final ObjectMapper mapper = new ObjectMapper();
    public static void writeReservation(Reservation reservation, String filePath) {
        try {
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(
                            new File(filePath),
                            reservation
                    );

            System.out.println("Reservation Saved To JSON");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static Reservation readReservation(String filePath) {
        try {

            Reservation reservation = mapper.readValue(new File(filePath), Reservation.class);

            System.out.println("Reservation Loaded From JSON");

            return reservation;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }
}