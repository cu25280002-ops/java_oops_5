// File name: Q07_PatientMain.java
class Patient {
    private String patientName;
    private int age;
    private double weight;

    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        setAge(age);
        setWeight(weight);
    }

    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }

    public void setPatientName(String patientName) { this.patientName = patientName; }

    public void setAge(int age) {
        if (age >= 0) this.age = age;
        else System.out.println("Invalid age. Age must be 0 or above.");
    }

    public void setWeight(double weight) {
        if (weight > 0) this.weight = weight;
        else System.out.println("Invalid weight. Weight must be greater than 0.");
    }

    void displayPatient() {
        System.out.println("Name: " + patientName + ", Age: " + age + ", Weight: " + weight);
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient patient = new Patient("Anaya", 30, 58.5);
        patient.setAge(31);       // Valid update
        patient.setAge(-5);       // Invalid update rejected
        patient.setWeight(60.0);  // Valid update
        patient.setWeight(0);     // Invalid update rejected
        patient.displayPatient();
    }
}
