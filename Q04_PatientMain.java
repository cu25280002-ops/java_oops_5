// File name: Q04_PatientMain.java
class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("ID: " + patientId + ", Name: " + patientName + ", Age: " + age);
    }
}

class PatientManager {
    void displayAllPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) { // Local loop variable
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(1, "Asha", 25),
            new Patient(2, "Rohan", 32),
            new Patient(3, "Meera", 41),
            new Patient(4, "Kabir", 19),
            new Patient(5, "Isha", 55)
        };
        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}
