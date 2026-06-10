import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Swechchha",1);
        map.put("Ramesh",2);
        map.put("Shyam",3);
        System.out.println("Values in hashmap are: "+ map);
        map.remove("Swechchha");
        System.out.println("values in after removing: "+map);
        
    }
}
