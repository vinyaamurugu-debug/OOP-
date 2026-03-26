class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    protected void display() {
        System.out.println("Basic Calculator Display");
    }

    private void show() {
        System.out.println("Private show() in Calculator");
    }

    public void accessPrivate() {
        show(); 
    }
}

class AdvancedCalculator extends Calculator {

    @Override
    public int add(int a, int b) {
        return a + b + 10; 
    }

    @Override
    protected void display() {
        System.out.println("Advanced Calculator Display Vinyaa51");
    }

   
    public void show() {
        System.out.println("show() in AdvancedCalculator");
    }
}

public class Mainpoly2 {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println("Base add: " + c.add(5, 5));
        c.display();
        c.accessPrivate();

        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println("Child add: " + ac.add(5, 5));
        ac.display();
        ac.show();

      
        Calculator ref = new AdvancedCalculator();
        System.out.println("Polymorphism add: " + ref.add(5, 5));
        ref.display();
    }
}