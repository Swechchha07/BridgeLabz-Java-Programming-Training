import java.util.regex.*;
public class CountDigits {
    public static void main(String[] args) {
        String text="Hello123World45";
        String regex="[0-9]";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(text);
        int count=0;
        while(m.find()){
            count++;
        }
        System.out.println("COunt: "+count);
    }
}
