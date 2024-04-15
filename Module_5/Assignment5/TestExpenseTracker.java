/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("Welcome to the Expense Tracker\n");
            System.out.println("MENU OPTIONS");
            System.out.println("1. View Transactions");
            System.out.println("2. Add Transactions");
            System.out.println("3. View Total Expenses");
            System.out.println("4. Exit\n");
            System.out.print("Please choose an option: ");

            option = ValidatorIO.getInt(sc, "");

            switch (option) {
                case 1:
                    viewTransactions();
                    break;
                case 2:
                    addTransactions(sc);
                    break;
                case 3:
                    viewTotalExpenses();
                    break;
                case 4:
                    exitProgram();
                    break;
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        } while (option != 4);
    }

    public static void viewTransactions() throws IOException {
        ArrayList<Transaction> allTransactions = TransactionIO.findAll();
        if (allTransactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            System.out.println("Transactions:");
            for (Transaction transaction : allTransactions) {
                System.out.printf("Date: %s, Description: %s, Amount: $%,6.2f\n",
                        transaction.getDate(), transaction.getDescription(), transaction.getAmount());
            }
        }
    }

    public static void addTransactions(Scanner sc) {
        String choice = "y";
        ArrayList<Transaction> transactions = new ArrayList<>();

        while (choice.equalsIgnoreCase("y")) {
            String description = ValidatorIO.getString(sc, "\nEnter the description: ");
            double amount = ValidatorIO.getDouble(sc, "Enter the amount: ");

            Transaction transaction = new Transaction(description, amount);
            transactions.add(transaction);

            choice = ValidatorIO.getString(sc, "\nAdd another transaction? (y/n): ");
        }

        try {
            TransactionIO.bulkInsert(transactions);
        } catch (IOException e) {
            System.out.println("\nException: " + e.getMessage());
        }
    }

    public static void viewTotalExpenses() throws IOException {
        ArrayList<Transaction> allTransactions = TransactionIO.findAll();
        double totalExpenses = 0;

        for (Transaction transaction : allTransactions) {
            totalExpenses += transaction.getAmount();
        }

        System.out.printf("Total Expenses: $%,6.2f\n", totalExpenses);
    }

    public static void exitProgram() {
        System.out.print("Continue? (y/n): ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("n")) {
            System.out.println("Program terminated by the user... ");
            System.exit(0);
        }
    }
}


