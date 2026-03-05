class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int studentId;
    String course;

    Student(String name, int age, int studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

public class Main51 {
    public static void main(String[] args) {
        Student s = new Student("Vinyaa", 19, 51, "CSE");
        s.displayDetails();
    }
}