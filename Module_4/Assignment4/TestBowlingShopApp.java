/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment4;

import java.util.Scanner;

public class TestBowlingShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            String option = scanner.nextLine().trim().toLowerCase();

            if (option.equals("x")) {
                System.out.println("Exiting...");
                break;
            }

            GenericQueue<Product> products = ProductDB.getProducts(option);

            System.out.println("\n--Product Listing--");

            while (!products.isEmpty()) {
                Product product = products.dequeue();
                System.out.println(product);
                System.out.println(); //Spacing between each listing to the user
            }
        }

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\nMENU OPTIONS");
        System.out.println("1. <b> Bowling Balls");
        System.out.println("2. <a> Bowling Bags");
        System.out.println("3. <s> Bowling Shoes");
        System.out.println("4. <x> To exit");
        System.out.print("\nPlease choose an option: ");
    }
}


