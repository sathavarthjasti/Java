package Java.EncapsulationandPolymorphism;

public class BankAccount {

    private Double balance;
    private String accountNumber;


    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }


    public double checkBalance() {
        return balance;
    }


    public void monthlyInterest() {
        System.out.println("Monthly interest calculation not implemented for generic bank account.");
    }


    public String getAccountNumber() {
        return accountNumber;
    }
}

