import java.io.*;
public class ParseCSV {
    public static void main(String[] args) {

        try(BufferedReader br =new BufferedReader(new FileReader("students.csv"))) {
            br.readLine();
            String line;
            while((line = br.readLine()) != null) {
                 if (line.trim().isEmpty()) {
                 continue;
            }
                String[] data = line.split(",");
                int id =Integer.parseInt(data[0]);
                String name =data[1];
                int age =Integer.parseInt(data[2]);
                System.out.println(id + " "+ name + " "+ age );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}