
import java.util.Scanner;

public class two {

    public static void main(String[] args) {
        int s1, s2, s3, s4, s5, tm;
        Scanner sc;
        double avg;
        System.out.println("Enter the marks:");
        sc = new Scanner(System.in);
        System.out.print("Maths:");
        s1 = sc.nextInt();
        System.out.print("Physics:");
        s2 = sc.nextInt();
        System.out.print("Chemistry:");
        s3 = sc.nextInt();
        System.out.print("English:");
        s4 = sc.nextInt();
        System.out.print("Telugu:");
        s5 = sc.nextInt();
        sc.close();
        if (s1 <= 100 && s2 <= 100 && s3 <= 100 && s4 <= 100 && s5 <= 100) {
            tm = s1 + s2 + s3 + s4 + s5;
            avg = tm / 5;
            System.out.println("Total marks:" + tm);
            System.out.println("Average Percentage:" + avg + "%");
            if (avg > 90) {
                System.out.println("Grade obtained: A");
            } else if (avg <= 90 && avg > 70) {
                System.out.println("Grade obtained: B");
            } else if (avg <= 70 && avg > 50) {
                System.out.println("Grade obtained: C");
            } else if (avg <= 50 && avg > 40) {
                System.out.println("Grade obtained: D");
            } else {
                System.out.println("Grade obtained: F");
            }

        } else {
            System.out.println("Enter Valid input!");
        }

    }

}
