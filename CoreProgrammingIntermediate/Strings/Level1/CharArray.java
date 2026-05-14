import java.util.Scanner;
public class CharArray {
    public static char[] getCharacters(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] array1 = getCharacters(text);
        char[] array2 = text.toCharArray();
        boolean result = compareArrays(array1, array2);
        System.out.println("Characters using user-defined method:");
        for (char ch : array1) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("Characters using toCharArray() method:");
        for (char ch : array2) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("Are both arrays same? " + result);
    }
}