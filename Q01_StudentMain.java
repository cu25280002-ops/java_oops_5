// File name: Q01_StudentMain.java
class Student {
    String name;
    int rollNo;
    double marks;

    Student() {
        this.name = "Aarav";
        this.rollNo = 101;
        this.marks = 85.5;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}
