class InvoiceProcessor {

    public void generateInvoice(String customer, double amount) {
        System.out.println("Invoice for " + customer + ": " + amount);
    }

    private double calculateTax(double amount) {
        return amount * 0.18;
    }

    public void showTotal(String customer, double amount) {
        double tax = calculateTax(amount);
        System.out.println("Total with tax: " + (amount + tax));
    }
}

class RetailInvoice extends InvoiceProcessor {

    @Override
    public void generateInvoice(String customer, double amount) {
        double discount = amount * 0.1;
        double finalAmount = amount - discount;
        System.out.println("Retail Invoice for " + customer + ": " + finalAmount + " Vinyaa51");
    }
}

public class Mainpoly4 {
    public static void main(String[] args) {

        // Runtime Polymorphism
        InvoiceProcessor ref = new RetailInvoice();

        ref.generateInvoice("Vinyaa", 1000); // calls child method
        ref.showTotal("Vinyaa", 1000); // parent method
    }
}