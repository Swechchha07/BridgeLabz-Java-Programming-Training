import java.util.regex.*;
public class WordFound {
    public static void main(String[] args) {
        String text="Java is powerful";
        Pattern p=Pattern.compile("Java");
        Matcher m=p.matcher(text);
        if(m.find()){
            System.out.println("Word Found");
        }else{
            System.out.println("Word Not Found");
        }
    }
}
