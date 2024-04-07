/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment4;

public class Bag extends Product {
    //Private data field
    private String type;

    //Constructor
    public Bag() {
        super(); //Call superclass constructor
        this.type = "";
    }

    //Accessor method
    public String getType() {
        return type;
    }

    //Mutator method
    public void setType(String type) {
        this.type = type;
    }

    //Override toString() method
    @Override
    public String toString() {
        return super.toString() + "\nType: " + type;
    }
}

