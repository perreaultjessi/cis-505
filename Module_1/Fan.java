/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
public class Fan { 
    // Constants representing 3 levels of fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;


    //Private variables for fan states
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    //Constructor method for default state
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }


    //Constructor method for custom fan
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    //Geter Method for speed
    public int getSpeed() {
        return speed;
    }


    //Setter method for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }


    //Getter method for On
    public boolean isOn() {
        return on;
    }



    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Override toString method
    @Override
    public String toString() {
        if (on) {
            return "The fan speed is at " + speed + " with the color of " + color + " with a radius of " + radius;
        } else {
            return "The fan is " + color + " with a radius of " + radius + " and the fan is off";
        }
    }

    public static void main(String[] args) {
        Fan defaultFan = new Fan();
        Fan argumentFan = new Fan(MEDIUM, true, 8.0, "blue");

        System.out.println("Default Fan: ");
        System.out.println(defaultFan);

        System.out.println("\nArgument Fan: ");
        System.out.println(argumentFan);
    }
}
