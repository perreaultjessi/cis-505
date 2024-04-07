/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment4;

public class Product {
    //Private data fields
    private String code;
    private String description;
    private double price;

    //Constructor for default product
    public Product() {
        this.code = "";
        this.description = "";
        this.price = 0.0;
    }

    //Accessor methods
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    //Mutator methods
    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Override toString() method
    @Override
    public String toString() {
        return "Product Code: " + code + "\nDescription: " + description + "\nPrice: $" + price;
    }
}

