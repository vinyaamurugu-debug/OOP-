abstract class PaymentVinyaa {
    abstract void pay(double amount); // abstract method

    // common method
    void display() {
        System.out.println("Processing Payment...");
    }
}

// Credit Card Payment
class CreditCard51 extends PaymentVinyaa {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

// UPI Payment
class UPI51 extends PaymentVinyaa {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class MainAbstract1{
    public static void main(String[] args) {
        PaymentVinyaa p;

        p = new CreditCard51();
        p.display();
        p.pay(2000);

        p = new UPI51();
        p.display();
        p.pay(1500);
    }
}