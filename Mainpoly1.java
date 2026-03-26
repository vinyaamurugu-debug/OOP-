class Calculator{
public int add(int a, int b){
return a + b;
}
protected int add(int a, int b, int c){
return a + b + c;
}
private double add(double a, double b){
return a + b;
}
public void displayDecimalAddition(double a, double b){
double result = add(a,b);
System.out.println("Sum of decimals = " + result  );
}
}
public class Mainpoly1 {
public static void main(String[] args){
Calculator calc = new Calculator();
System.out.println("Sum of 2 integers =" + calc.add(5,10));
System.out.println("Sum of 3 integers =" + calc.add(5,10,15));
 calc.displayDecimalAddition(2.5, 3.5);
}
}