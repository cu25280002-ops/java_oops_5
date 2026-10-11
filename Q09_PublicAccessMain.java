// File name: Q09_PublicAccessMain.java
class Hospital {
    // Public members can be accessed directly from another class.
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "City Hospital";
        hospitalCode = "CH101";
    }

    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Code: " + hospitalCode);
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        System.out.println(hospital.hospitalName);
        System.out.println(hospital.hospitalCode);
        hospital.displayHospital();
    }
}
