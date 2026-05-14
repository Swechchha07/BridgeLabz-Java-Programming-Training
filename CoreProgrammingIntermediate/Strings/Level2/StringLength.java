import java.util.Scanner;
public class StringLength {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        int customLength = findLength(text);
        int actualLength = text.length();
        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length() method: " + actualLength);
    }
}