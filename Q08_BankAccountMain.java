// File name: Q08_BankAccountMain.java
class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = Math.max(0, balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit must be positive.");
        }
    }

    void withdraw(double amount) {
        boolean success = false; // Local variable tracks withdrawal result
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            success = true;
        }
        if (success) System.out.println("Withdrawal successful: " + amount);
        else System.out.println("Withdrawal failed: invalid amount or insufficient balance.");
    }

    double getBalance() { return balance; }

    void displayAccount() {
        System.out.println("Account: " + accountNo);
        System.out.println("Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", "Riya Sharma", 1000);
        account.deposit(500);
        account.withdraw(300);
        account.displayAccount();
    }
}
