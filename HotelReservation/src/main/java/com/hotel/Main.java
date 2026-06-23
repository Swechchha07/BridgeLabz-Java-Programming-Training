package com.hotel;

import com.hotel.io.CsvHandler;
import com.hotel.io.FileOperations;
import com.hotel.io.JsonHandler;
import com.hotel.model.Reservation;
import com.hotel.model.Room;
import com.hotel.service.ReservationService;
import com.hotel.threads.NotificationDispatcher;
import com.hotel.threads.PaymentProcessor;
import com.hotel.threads.ThreadStateTracker;
import com.hotel.threads.VirtualThreadSimulator;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println(" COZYHAVEN HOTEL RESERVATION SYSTEM ");
        List<Room> rooms =CsvHandler.readRooms("src/main/resources/rooms.csv");
        System.out.println("\nAll Valid Rooms:");
        System.out.println(rooms);

        ReservationService service =new ReservationService();
        List<Room> availableRooms = service.findAvailableRooms(rooms, "Single", 200);
        System.out.println("\nAvailable Single Rooms Under ₹200:");
        System.out.println(availableRooms);

        Reservation reservation = new Reservation("RES101", "Swechchha", 101, 3, 3600, "Pending");

        System.out.println("\nReservation Created Successfully");

        System.out.println(reservation);
        JsonHandler.writeReservation(reservation, "reservation.json");

        Reservation loadedReservation = JsonHandler.readReservation("reservation.json");
        System.out.println("\nLoaded Reservation From JSON:");

        System.out.println(loadedReservation);
        service.addBooking("2026-06-22", reservation);

        service.trackRevenue("Single", reservation.getTotalAmount());

        System.out.println("\n PAYMENT THREAD ");

        PaymentProcessor payment = new PaymentProcessor(reservation);

        payment.start();
        payment.join();

        System.out.println(
                "\n NOTIFICATION THREAD ");

        Thread notification = new Thread(new NotificationDispatcher(reservation));

        notification.start();
        notification.join();
        System.out.println("\n THREAD LIFE CYCLE ");

        ThreadStateTracker.demonstrateLifecycle();
        System.out.println("\nVIRTUAL THREADS ");

        VirtualThreadSimulator.runTest();
        System.out.println("\n FILE OPERATIONS ");

        FileOperations.verifyDirectories("receipts");

        String receipt = """
                ===== HOTEL RECEIPT =====
                Reservation ID : RES101
                Guest Name     : Swechchha
                Room Number    : 101
                Nights         : 3
                Amount         : 3600
                Status         : Confirmed
                =========================
                """;

        FileOperations.writeReceipt("receipts/receipt.txt", receipt);

        System.out.println("Receipt Generated Successfully");

        FileOperations.backupCatalog(new File("src/main/resources/rooms.csv"), new File("src/main/resources/rooms_backup.csv");

        System.out.println("Catalog Backup Complete");

        System.out.println("\n PROJECT COMPLETED SUCCESSFULLY ");
    }
}