import java.util.Scanner;
public class addition{
public static void main(String[]args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter a number:");
int A=obj.nextInt();
System.out.println("Enter a number:");
int B=obj.nextInt();
int sum = A+B;
System.out.println("The Sum is:" +sum);
}
}