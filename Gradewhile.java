import java.util.Scanner;

public class GradeWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0, i = 1;

        while (i <= 5) {
            System.out.print("Enter mark of subject " + i + ": ");
            sum += sc.nextInt();
            i++;
        }

        double avg = sum / 5.0;

        if (avg >= 90) System.out.println("Grade: A");
        else if (avg >= 75) System.out.println("Grade: B");
        else if (avg >= 50) System.out.println("Grade: C");
        else System.out.println("Grade: Fail");

       
    }
}