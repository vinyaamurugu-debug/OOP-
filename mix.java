import java.util.Scanner;

public class mix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        sc.nextLine();   

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.println(name + " is " + age + " years old.");
    }
}