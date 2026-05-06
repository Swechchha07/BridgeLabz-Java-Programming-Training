import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        int[] digits=new int[count];
        temp=n;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        int[] freq = new int[10]; 

        for (int i = 0; i < count; i++) {
            int digit = digits[i];
            freq[digit]++;
        }
        System.out.println("Digit Frequencies:");

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " - " + freq[i]);
            }
        }
    }
}
