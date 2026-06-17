import java.util.*;
import java.util.stream.*;
public class CollectExample {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,4,5,6,7);
        List<Integer> evenNum=
            nums.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(evenNum);
    }
}
