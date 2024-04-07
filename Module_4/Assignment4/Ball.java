/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment4;

public class Ball extends Product {
    //Private data field
    private String color;

    //Constructor
    public Ball() {
        super(); //Call superclass constructor
        this.color = "";
    }

    //Accessor method
    public String getColor() {
        return color;
    }

    //Mutator method
    public void setColor(String color) {
        this.color = color;
    }

    //Override toString() method
    @Override
    public String toString() {
        return super.toString() + "\nColor: " + color;
    }
}
