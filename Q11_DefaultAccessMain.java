// File name: Q11_DefaultAccessMain.java
class Pharmacy {
    // No access keyword means these members are default/package-private.
    String medicineName;
    double price;

    Pharmacy() {
        medicineName = "Vitamin C";
        price = 45.0;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName + ", Price: " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        System.out.println(pharmacy.medicineName);
        System.out.println(pharmacy.price);
        pharmacy.displayMedicine();
    }
}
