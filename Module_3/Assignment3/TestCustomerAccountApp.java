/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/
package Assignment3;

import java.util.Date;
import java.text.SimpleDateFormat;

import java.util.Scanner;

public class TestCustomerAccountApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Customer Account App");

        Scanner scanner = new Scanner(System.in);
        Customer customer = null;

        //Prompt user input for customer id
        int customerId;
        do {
            System.out.print("Enter a Customer ID (1007-1009): ");
            customerId = scanner.nextInt();

            //Invoke getCustomer static method and assign value to customer variable
            customer = CustomerDB.getCustomer(customerId);

            if (customer.getName() == null) {
                System.out.println("Error: Invalid option.");
            }
        } while (customer.getName() == null);

        Account account = new Account();

        //Display account menu
        do {
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
                    System.out.println("Error: Invalid option.");
            }

            System.out.print("Continue? (y/n) ");
        } while (scanner.next().equalsIgnoreCase("Y"));

        //Display customer details message
        System.out.println("--Customer Details--\n" + customer.toString());

        //Display transaction date
        Date currentDate = new Date();

        //format date in MM-dd-yyyy format
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        String formattedDate = dateFormat.format(currentDate);

        //display customers balance with date
        System.out.println("Balance as of " + formattedDate + " is $" + account.getBalance());

        scanner.close();
    }
}

