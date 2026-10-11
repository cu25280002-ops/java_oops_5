// File name: Q06_MedicineProductMain.java
class MedicineProduct {
    private String medicineName;
    private String batchNo;
    private double price;

    MedicineProduct(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    public String getMedicineName() { return medicineName; }
    public String getBatchNo() { return batchNo; }
    public double getPrice() { return price; }

    public void setMedicineName(String medicineName) { this.medicineName = medicineName; }
    public void setBatchNo(String batchNo) { this.batchNo = batchNo; }
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
        else System.out.println("Price cannot be negative.");
    }

    void displayProduct() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Batch: " + batchNo);
        System.out.println("Price: " + price);
    }
}

public class MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Paracetamol", "B100", 30.0);
        product.setPrice(32.5);
        product.setBatchNo("B101");
        System.out.println("Updated medicine name: " + product.getMedicineName());
        product.displayProduct();
    }
}
