import java.util.*;
public class StudentsMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.println("Enter Physics marks");
            physics[i] = sc.nextInt();

            System.out.println("Enter Chemistry marks");
            chemistry[i] = sc.nextInt();

            System.out.println("Enter Maths marks");
            maths[i] = sc.nextInt();
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid number! Enter again");
                i--;
                continue;
            }
            int totalMarks = physics[i] + chemistry[i] + maths[i];
            percentage[i] = totalMarks / 3.0;
            if (percentage[i] >= 80) {
                grades[i] = 'A';
            } else if (percentage[i] >= 70) {
                grades[i] = 'B';
            } else if (percentage[i] >= 60) {
                grades[i] = 'C';
            } else if (percentage[i] >= 50) {
                grades[i] = 'D';
            } else if (percentage[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.printf("Percentage: %.2f\n", percentage[i]);
            System.out.println("Grade: " + grades[i]);
        }
    }
}