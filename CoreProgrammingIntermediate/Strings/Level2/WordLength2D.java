import java.util.Scanner;
public class WordLength2D {
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
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[index] = word;
                index++;
                start = i + 1;
            }
        }

        String lastWord = "";
        for (int i = start; i < length; i++) {
            lastWord += text.charAt(i);
        }
        words[index] = lastWord;
        return words;
    }
    public static String[][] getWordAndLength(String[] words) {
        String[][] result = new String[words.length][2];
            for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int len = findLength(words[i]);
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static void display(String[][] arr) {

        System.out.println("\nWord\tLength");

        for (int i = 0; i < arr.length; i++) {

            int length = Integer.parseInt(arr[i][1]);

            System.out.println(arr[i][0] + "\t" + length);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);

        String[][] result = getWordAndLength(words);

        display(result);

        sc.close();
    }
}