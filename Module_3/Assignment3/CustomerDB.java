/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/
package Assignment3;

public class CustomerDB {
    public static Customer getCustomer(Integer id) {
        if (id.equals(1007)) {
            return new Customer("Jessi", "80 Rainbow Rd", "Anaheim", "12345");
        } else if (id.equals(1008)) {
            return new Customer("Mark", "90 West Elm St", "Oceanside", "54321");
        } else if (id.equals(1009)) {
            return new Customer("Monica", "10 Nickelson Rd", "Irvine", "12340");
        } else {
            return new Customer(); //Default customer object
        }
    }
}

