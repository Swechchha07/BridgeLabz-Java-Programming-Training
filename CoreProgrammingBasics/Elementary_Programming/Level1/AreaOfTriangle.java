import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        System.out.println("base is"+ base);
        System.out.println("height is"+ height);
        double areaCm=0.5*base*height;
        double areaInches= areaCm / (2.54*2.54);
        System.out.println("The area of triangle in square cm is " + areaCm + " and in square inches is " + areaInches);
    }
}
