// File name: Q15_MultilevelMain.java
class Person { // Level 1: top-level super class
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person { // Level 2: child of Person, parent of Manager
    private int employeeId;

    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    int getEmployeeId() { return employeeId; }
}

class Manager extends Employee { // Level 3: final child class
    private int teamSize;

    Manager(String name, int age, int employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }

    void displayManager() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Team size: " + teamSize);
    }
}

public class MultilevelMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Karan", 38, 501, 8);
        manager.displayManager();
    }
}
