// File name: Q10_PrivateAccessMain.java
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }

    public void displayEmployee() {
        System.out.println("ID: " + employeeId + ", Name: " + employeeName + ", Salary: " + salary);
    }
}

public class PrivateAccessMain {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Rahul", 35000);
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getSalary());
        employee.displayEmployee();

        // Not allowed: System.out.println(employee.salary);
        // salary is private and can only be accessed inside Employee.
    }
}
