import java.util.*;
import java.util.stream.*;
public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(2,3,4,5,6,7,8);
        nums.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);
    }
}
