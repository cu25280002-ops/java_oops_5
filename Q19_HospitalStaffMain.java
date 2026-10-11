// File name: Q19_HospitalStaffMain.java
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int employeeId;
    private double salary;
    static int employeeCount = 0;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = Math.max(0, salary);
        employeeCount++;
    }

    public int getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
        else System.out.println("Salary cannot be negative.");
    }

    void displayStaff() {
        System.out.println("Name: " + name + ", Age: " + age + ", ID: " + employeeId
                + ", Salary: " + salary);
    }
}

class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int age, int employeeId, double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    String getSpecialization() { return specialization; }

    @Override
    void displayStaff() {
        super.displayStaff();
        System.out.println("Role: Doctor, Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    String getLicenseNo() { return licenseNo; }

    @Override
    void displayStaff() {
        super.displayStaff();
        System.out.println("Role: Pharmacist, License: " + licenseNo);
    }
}

class HospitalStaffManager {
    void displayStaff(Employee[] staff) {
        int doctorCount = 0; // Local variable
        for (int i = 0; i < staff.length; i++) {
            staff[i].displayStaff();
            if (staff[i] instanceof Doctor) doctorCount++;
            System.out.println();
        }
        System.out.println("Doctors in list: " + doctorCount);
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Dr. Sen", 45, 101, 80000, "Pediatrics"),
            new Pharmacist("Nikhil", 29, 102, 42000, "PH-908"),
            new Doctor("Dr. Khan", 39, 103, 75000, "Surgery")
        };
        HospitalStaffManager manager = new HospitalStaffManager();
        manager.displayStaff(staff);
        System.out.println("Total employee objects created: " + Employee.employeeCount);
    }
}
