class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }
}

class ProjectManager extends Manager {
    String projectName;

    ProjectManager(String name, double salary, int teamSize, String projectName) {
        super(name, salary, teamSize);
        this.projectName = projectName;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

public class Main5 {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager("Vinyaa", 70000, 10, "Bank App");
        pm.display();
    }
}