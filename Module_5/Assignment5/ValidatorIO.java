/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment5;

import java.util.Scanner;

public class ValidatorIO {

    public static int getInt(Scanner sc, String prompt) {
        int input = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("\nError! Invalid integer value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    public static double getDouble(Scanner sc, String prompt) {
        double input = 0.0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("\nError! Invalid double value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.next();
    }
}

