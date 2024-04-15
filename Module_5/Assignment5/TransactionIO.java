/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {
    private static final String FILE_NAME = "expenses.txt";
    private static File file = new File(FILE_NAME);

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;
        if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(file, true));
        } else {
            output = new PrintWriter(FILE_NAME);
        }

        for (Transaction tran : transactions) {
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount());
        }
        output.close();
    }

    public static ArrayList<Transaction> findAll() throws IOException {
        ArrayList<Transaction> allTransactions = new ArrayList<>();
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String date = input.next();
            String description = input.next();
            double amount = input.nextDouble();
            input.nextLine();
            Transaction transaction = new Transaction(date, description, amount);
            allTransactions.add(transaction);
        }
        input.close();
        return allTransactions;
    }
}
