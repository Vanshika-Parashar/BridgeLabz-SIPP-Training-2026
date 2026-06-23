package oops_practice.scenerio_based;

class BankAccount {

    // Static variable
    static int totalAccounts = 0;

    // Instance variables
    int accountNumber;
    String holder;
    double balance;

    // Constructor
    BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    // Withdraw method with overdraft check
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient Balance! Withdrawal of ₹" + amount + " failed.");
        }
    }

    // Account Statement
    void getStatement() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Holder Name: " + holder);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("--------------------------------");
    }
}

public class BankManagement {
    public static void main(String[] args) {

        // Creating 3 accounts
        BankAccount acc1 = new BankAccount(1001, "Vanshika", 10000);
        BankAccount acc2 = new BankAccount(1002, "Rahul", 15000);
        BankAccount acc3 = new BankAccount(1003, "Priya", 20000);

        // 5 Transactions for Account 1
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.deposit(1000);
        acc1.withdraw(5000);
        acc1.withdraw(7000);

        // 5 Transactions for Account 2
        acc2.deposit(3000);
        acc2.withdraw(2000);
        acc2.deposit(500);
        acc2.withdraw(10000);
        acc2.withdraw(8000);

        // 5 Transactions for Account 3
        acc3.deposit(4000);
        acc3.withdraw(3000);
        acc3.deposit(2000);
        acc3.withdraw(15000);
        acc3.withdraw(10000);

        // Display Statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Total accounts created
        System.out.println("Total Accounts Created: " + BankAccount.totalAccounts);
    }
}
