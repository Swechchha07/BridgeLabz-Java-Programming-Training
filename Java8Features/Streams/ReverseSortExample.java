import java.util.*;
import java.util.stream.*;
public class ReverseSortExample {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
        nums.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);
    }
}
