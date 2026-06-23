package com.hotel.io;

import java.io.*;

public class FileOperations {

    public static void verifyDirectories(String dirPath) {
        File directory = new File(dirPath);
        if(!directory.exists()) {
            directory.mkdirs();
            System.out.println("Directory Created");
        }
    }
    public static void backupCatalog(File source, File destination) {
        try(FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination))
        {
            int ch;
            while((ch = fr.read()) != -1){
                fw.write(ch);
            }
            System.out.println("Catalog Backup Complete");

        } catch(Exception e){

            e.printStackTrace();
        }
    }

    public static void copyBinaryLog(File source, File destination){
        try(FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination))
        {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while((bytesRead = fis.read(buffer)) != -1){
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Binary Copy Complete");

        } catch(Exception e){

            e.printStackTrace();
        }
    }

    public static void writeReceipt(String filePath, String content){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath)))
        {
            bw.write(content);
            bw.flush();

        } catch(Exception e){

            e.printStackTrace();
        }
    }
}