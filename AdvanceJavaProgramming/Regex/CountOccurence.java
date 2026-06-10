import java.util.regex.*;
public class CountOccurence{
    public static void main(String[] args){
        String text="Java is easy.Java is powerful.Java is popular";
        Pattern p=Pattern.compile("Java");
        Matcher m=p.matcher(text);
        int count=0;
        while(m.find()){
            count++;
        }
        System.out.println("Count: "+ count);

    }
}