/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/
package Assignment3;

public class Customer {
    //Private instance variables
    private String Name;
    private String Address;
    private String City;
    private String Zip;

    //Noargument constructor for default customer
    public Customer() {
        this.Name = "NONE";
        this.Address = "NONE";
        this.City = "NONE";
        this.Zip = "NONE";
    }

    //Constructor for custom customer with arguments
    public Customer(String Name, String Address, String City, String Zip) {
        this.Name = Name;
        this.Address = Address;
        this.City = City;
        this.Zip = Zip;
    }

    //accessor methods for all four data fields
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String Zip) {
        this.Zip = Zip;
    }

    //Override the toString() method to return a string description for a customer
    @Override
    public String toString() {
        return "Name: " + Name + "\nAddress: " + Address + "\nCity: " + City + "\nZip: " + Zip;
    }
}
