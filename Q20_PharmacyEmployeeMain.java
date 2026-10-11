// File name: Q20_PharmacyEmployeeMain.java
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    static int employeeCount = 0; // Shared class variable
    protected String department = "Pharmacy"; // Useful inherited protected member

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary);
        employeeCount++;
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }

    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
        else {
            this.salary = 0;
            System.out.println("Negative salary rejected; salary set to 0.");
        }
    }

    // Default/package-private method: no access keyword.
    void displayBasicInfo() {
        System.out.println("ID: " + employeeId + ", Name: " + employeeName
                + ", Salary: " + salary + ", Department: " + department);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    String getLicenseNo() { return licenseNo; }

    void displayRole() {
        displayBasicInfo();
        System.out.println("Role: Pharmacist, License: " + licenseNo);
    }
}

class StoreManager extends Employee {
    private int storeSection;

    StoreManager(int employeeId, String employeeName, double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    int getStoreSection() { return storeSection; }

    void displayRole() {
        displayBasicInfo();
        System.out.println("Role: Store Manager, Section: " + storeSection);
    }
}

class EmployeeManager {
    void processEmployees(Employee[] employees) {
        double totalSalary = 0; // Local variable
        int i;
        for (i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Pharmacist) {
                ((Pharmacist) employees[i]).displayRole();
            } else if (employees[i] instanceof StoreManager) {
                ((StoreManager) employees[i]).displayRole();
            } else {
                employees[i].displayBasicInfo();
            }
            totalSalary += employees[i].getSalary();
            System.out.println();
        }
        System.out.println("Employee count: " + Employee.employeeCount);
        System.out.println("Total salary: " + totalSalary);
    }
}

public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(201, "Suman", 38000, "LIC-100"),
            new StoreManager(202, "Vikram", 50000, 3),
            new Pharmacist(203, "Kavya", 40000, "LIC-101")
        };
        EmployeeManager manager = new EmployeeManager();
        manager.processEmployees(employees);
    }
}
