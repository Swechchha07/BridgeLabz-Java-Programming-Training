import java.util.regex.*;
public class ReplaceWord {
    public static void main(String[] args) {
        String text="Java,Python";
        String result=text.replaceAll("Java", "Python");
        System.out.println(result);
    }
}
