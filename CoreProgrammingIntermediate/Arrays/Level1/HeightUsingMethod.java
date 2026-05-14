import java.util.*;
public class HeightUsingMethod {
    public static double findMean(double[] height){
        double sum=0.0;
        for(int i=0;i<height.length;i++){
            sum+=height[i];
        }
        double mean=sum/height.length;
        return mean;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] height=new double[11];
        System.out.println("Enter heights of 11 players:");
        for (int i = 0; i < height.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            height[i] = sc.nextDouble();
        }
        findMean(height);
        double ans=findMean(height);
        System.out.println(ans);
    }
}
