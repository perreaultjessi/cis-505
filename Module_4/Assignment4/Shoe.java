/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment4;

public class Shoe extends Product {
    //Private data field
    private double size;

    //Constructor
    public Shoe() {
        super(); //call superclass constructor
        this.size = 0.0;
    }

    //Accessor method
    public double getSize() {
        return size;
    }

    //Mutator method
    public void setSize(double size) {
        this.size = size;
    }

    //Override toString() method
    @Override
    public String toString() {
        return super.toString() + "\nSize: " + size;
    }
}

