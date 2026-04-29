import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int height=sc.nextInt();
        int areaCm=(1/2)*base*height;
        double areaInches= areaCm / (2.54*2.54);
        System.out.println("The area of triangle in square cm is " + areaCm + " and in square inches is " + areaInches);
    }
}
