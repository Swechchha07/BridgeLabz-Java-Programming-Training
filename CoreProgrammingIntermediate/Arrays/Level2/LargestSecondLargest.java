import java.util.*;

public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxDigit = 10;  
        int[] digits = new int[maxDigit];
        int index = 0;
        int temp = number;
        while (temp > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] newArray = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    newArray[i] = digits[i];
                }

                digits = newArray; 
            }
            digits[index] = temp % 10;
            index++;
            temp = temp / 10;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest digit");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }
    }
}