// File name: Q03_PharmacyMain.java
class Pharmacy {
    String pharmacyName;
    String location;
    static int pharmacyCount = 0; // Shared by all Pharmacy objects

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }

    void displayPharmacy() {
        System.out.println("Pharmacy: " + pharmacyName + ", Location: " + location);
    }

    static void displayPharmacyCount() {
        System.out.println("Total pharmacies: " + pharmacyCount);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("City Pharmacy", "Agra");
        Pharmacy p2 = new Pharmacy("Health Plus", "Delhi");
        Pharmacy p3 = new Pharmacy("Care Pharmacy", "Jaipur");
        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();
        Pharmacy.displayPharmacyCount();
    }
}
