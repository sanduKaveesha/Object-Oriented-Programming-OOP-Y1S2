package Q1;

public class SavingsAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount){
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited "+ amount + ". New Balance: "+ balance);
        }else{
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }

    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". New Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayAccountDetails(){
        System.out.println("\nFinal Account Details: ");
        System.out.println("Account Number: "+ getAccountNumber());
        System.out.println("Account Holder: "+ getAccountHolderName());
        System.out.println("Balance: "+ getBalance());
    }
}
