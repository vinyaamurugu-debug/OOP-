import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

  
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println("Post Increment (a++): " + (a++));
        System.out.println("Pre Increment (++a): " + (++a));
        System.out.println("Post Decrement (b--): " + (b--));
        System.out.println("Pre Decrement (--b): " + (--b));
        System.out.println("Logical NOT (!true): " + (!true));

        
    }
}