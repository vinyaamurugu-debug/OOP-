import java.util.Scanner;

public class GradeFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter mark of subject " + i + ": ");
            sum += sc.nextInt();
        }

        double avg = sum / 5.0;

        if (avg >= 90) System.out.println("Grade: A");
        else if (avg >= 75) System.out.println("Grade: B");
        else if (avg >= 50) System.out.println("Grade: C");
        else System.out.println("Grade: Fail");

        
    }
}