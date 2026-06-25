package Q1;

import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    SavingsAccount account = new SavingsAccount();

        System.out.print("Enter Account Number: ");
        account.setAccountNumber(sc.nextLine());

        System.out.print("Enter Account Holder Name: ");
        account.setAccountHolderName(sc.nextLine());

        System.out.print("Enter Initial Deposit: ");
        double initialDeposit = sc.nextDouble();

        account.deposit(initialDeposit);

        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();

        account.deposit(depositAmount);

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawAmount = sc.nextDouble();

        account.withdraw(withdrawAmount);

        account.displayAccountDetails();
    }
}
