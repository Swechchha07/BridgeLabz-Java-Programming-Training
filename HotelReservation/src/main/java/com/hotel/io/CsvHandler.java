package com.hotel.io;

import com.hotel.model.Room;
import com.hotel.validation.RoomValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvHandler {
    public static List<Room> readRooms(String path){
        List<Room> rooms = new ArrayList<>();
        RoomValidator validator = new RoomValidator();
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine();
            String line;
            while((line = br.readLine()) != null){
                try{
                    String[] data = line.split(",");
                    Room room = new Room(
                            Integer.parseInt(data[0]),
                            data[1],
                            Double.parseDouble(data[2]),
                            Boolean.parseBoolean(data[3])
                    );
                    List<String> errors = validator.validate(room);
                    if(errors.isEmpty()){
                        rooms.add(room);
                    }
                    else{
                        System.out.println(
                                "Rejected Record : " + errors);
                    }

                }
                catch(NumberFormatException e){
                    System.out.println("Invalid Data");
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return rooms;
    }
}