/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private String date;
    private String description;
    private double amount;

    //Default constructor
    public Transaction() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        this.date = dateFormat.format(new Date());
        this.description = "";
        this.amount = 0;
    }

    //Argument constructor
    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    //Constructor with description and amount
    public Transaction(String description, double amount) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        this.date = dateFormat.format(new Date());
        this.description = description;
        this.amount = amount;
    }

    //Accessor and mutator methods
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    //Override toString method
    @Override
    public String toString() {
        return "Date: " + date + "\nDescription: " + description + "\nAmount: $" + amount;
    }
}
