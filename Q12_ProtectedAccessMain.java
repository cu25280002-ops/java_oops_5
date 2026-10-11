// File name: Q12_ProtectedAccessMain.java
class HospitalStaff {
    protected int staffId;
    protected String staffName;

    protected HospitalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }

    protected void displayStaff() {
        System.out.println("Staff ID: " + staffId + ", Name: " + staffName);
    }
}

class Pharmacist extends HospitalStaff {
    private String licenseNo;

    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        // Child class can access inherited protected members.
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
        System.out.println("License: " + licenseNo);
        displayStaff();
    }
}

public class ProtectedAccessMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(10, "Neha", "LIC2026");
        pharmacist.displayPharmacist();
    }
}
