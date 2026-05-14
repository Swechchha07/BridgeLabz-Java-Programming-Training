import java.util.Scanner;
public class SplitText {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }
    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordsCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordsCount++;
            }
        }

        int[] spaceIndexes = new int[wordsCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }
        String[] words = new String[wordsCount];
        int start = 0;
        for (int i = 0; i < wordsCount - 1; i++) {
            String word = "";
            for (int j = start; j < spaceIndexes[i]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = spaceIndexes[i] + 1;
        }
        String lastWord = "";
        for (int i = start; i < length; i++) {
            lastWord += text.charAt(i);
        }
        words[wordsCount - 1] = lastWord;
        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {

            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void displayArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] userSplit = splitText(text);
        String[] builtInSplit = text.split(" ");
        System.out.println("Words using user-defined method:");
        displayArray(userSplit);
        System.out.println("Words using built-in split() method:");
        displayArray(builtInSplit);
        boolean result = compareArrays(userSplit, builtInSplit);
        System.out.println("Both arrays are same: " + result);
    }
}