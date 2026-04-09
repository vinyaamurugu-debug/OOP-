class EmployeeVinyaa {
    private String name;
    private double salary;
    private double bonus;

    // constructor
    EmployeeVinyaa(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.bonus = 0;
    }

    // set bonus (only valid values)
    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            System.out.println("Invalid bonus");
        }
    }

    // calculate total salary
    public double calculateTotalSalary() {
        return salary + bonus;
    }

    // getter (no setter for salary → protected)
    public double getSalary() {
        return salary;
    }

    public String getEmployeeDetails() {
        return "Employee Name: " + name;
    }
}

public class MainEncap2 {
    public static void main(String[] args) {
        EmployeeVinyaa emp = new EmployeeVinyaa("Anu", 30000);

        System.out.println(emp.getEmployeeDetails());

        emp.setBonus(5000);

        System.out.println("Base Salary: " + emp.getSalary());
        System.out.println("Total Salary: " + emp.calculateTotalSalary());
    }
}