import java.util.*;
public class Main {
    static void printList(List<?> list) {
        for(Object obj : list) {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 20, 30);
        List<String> names = Arrays.asList("Aman", "Riya");

        printList(nums);
        printList(names);
    }
}