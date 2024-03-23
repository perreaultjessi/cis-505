/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
//Define the TestFanApp Class
public class TestFanApp {
    //Method for entry of program
    public static void main(String[] args) {
        //Create Default Fan
        Fan defaultFan = new Fan();
        
        //Create Custom Fan
        //The fan is set to medium speed, is turned on, has a radius of 8.0, and is colored blue
        Fan argumentFan = new Fan(Fan.MEDIUM, true, 8.0, "blue");

        //Display Default Fan variables
        System.out.println("Default Fan: ");
        System.out.println(defaultFan);

        //Display Custom Fan Variables
        System.out.println("\nArgument Fan: ");
        System.out.println(argumentFan);
    }
}


