import java.util.*;
import java.util.stream.*;
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
        List<Integer> result=nums.stream()
                            .filter(n->n%2==0)
                            .map(n->n*n)
                            .sorted()
                            .collect(Collectors.toList());
         System.out.println(result);
    }
}
