/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/
package Assignment3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Account {
    //private instance variable
    private double balance;

    //default constructor with 200 default balance
    public Account() {
        this.balance = 200.0;
    }

    //accessor method for balance
    public double getBalance() {
        return balance;
    }

    //method to deposit specified amount into account
    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposit successful.");
    }

    //method to withdraw specified amount into account
    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    //method to display menu
    public void displayMenu() {
        System.out.println("Account Menu");
        System.out.println("Enter <D/d> for deposit");
        System.out.println("Enter <W/w> for withdraw");
        System.out.println("Enter <B/b> for balance");
        System.out.print("Enter option>: ");
    }

    //getmethod transaction date
    public String getTransactionDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        Date date = new Date();
        return formatter.format(date);
    }

    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            account.displayMenu();
            String option = scanner.next().toLowerCase();

            switch (option) {
                case "d":
                    System.out.print("Enter deposit amount: ");
                    double depositAmt = scanner.nextDouble();
                    account.deposit(depositAmt);
                    break;
                case "w":
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmt = scanner.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;
                case "b":
                    System.out.println("Balance: $" + account.getBalance());
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println("Transaction Date: " + account.getTransactionDate());
            System.out.println();
        }
    }
}

