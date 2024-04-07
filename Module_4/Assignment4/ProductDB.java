/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment4;

import java.util.Queue;
import java.util.LinkedList;

public class ProductDB {
    public static <T extends Product> GenericQueue<T> getProducts(String code) {
        GenericQueue<T> products = new GenericQueue<>();

        if (code.equalsIgnoreCase("b")) {
            //5 instances of ball object
            GenericQueue<Product> balls = new GenericQueue<Product>();

            Ball ball1 = new Ball();
            ball1.setCode("B500");
            ball1.setDescription("Phase III");
            ball1.setPrice(154.99);
            ball1.setColor("Purple and Green");
            products.add((T) ball1);
            balls.enqueue(ball1);

            Ball ball2 = new Ball();
            ball2.setCode("B400");
            ball2.setDescription("Zeus's Bolt");
            ball2.setPrice(140.99);
            ball2.setColor("Silver");
            products.add((T) ball2);
            balls.enqueue(ball2);

            Ball ball3 = new Ball();
            ball3.setCode("B300");
            ball3.setDescription("Ultimate Spin");
            ball3.setPrice(150.99);
            ball3.setColor("Rainbow");
            products.add((T) ball3);
            balls.enqueue(ball3);

            Ball ball4 = new Ball();
            ball4.setCode("B200");
            ball4.setDescription("10 Strike");
            ball4.setPrice(120.99);
            ball4.setColor("Yellow and Red");
            products.add((T) ball4);
            balls.enqueue(ball4);

            Ball ball5 = new Ball();
            ball5.setCode("B100");
            ball5.setDescription("Eldritch Blast");
            ball5.setPrice(115.99);
            ball5.setColor("Purple and Red");
            products.add((T) ball5);
            balls.enqueue(ball5);

            return (GenericQueue<T>) balls;
        } else if (code.equalsIgnoreCase("s")) {
            //5 instances of shoe object
            GenericQueue<Product> shoes = new GenericQueue<Product>();

            Shoe shoe1 = new Shoe();
            shoe1.setCode("S500");
            shoe1.setDescription("Youth Skull Black");
            shoe1.setPrice(39.99);
            shoe1.setSize(3.0);
            products.add((T) shoe1);
            shoes.enqueue(shoe1);

            Shoe shoe2 = new Shoe();
            shoe2.setCode("S400");
            shoe2.setDescription("Men's Tribal White");
            shoe2.setPrice(26.99);
            shoe2.setSize(6);
            products.add((T) shoe2);
            shoes.enqueue(shoe2);

            Shoe shoe3 = new Shoe();
            shoe3.setCode("S300");
            shoe3.setDescription("Women's Path Lite Mesh");
            shoe3.setPrice(39.99);
            shoe3.setSize(7.0);
            products.add((T) shoe3);
            shoes.enqueue(shoe3);

            Shoe shoe4 = new Shoe();
            shoe4.setCode("S200");
            shoe4.setDescription("Women's Rise Black/Hot Pink");
            shoe4.setPrice(39.99);
            shoe4.setSize(7.0);
            products.add((T) shoe4);
            shoes.enqueue(shoe4);

            Shoe shoe5 = new Shoe();
            shoe5.setCode("S100");
            shoe5.setDescription("Men's Ram Black");
            shoe5.setPrice(39.99);
            shoe5.setSize(11.5);
            products.add((T) shoe5);
            shoes.enqueue(shoe5);

            return (GenericQueue<T>) shoes;
        } else if (code.equalsIgnoreCase("a")) {
            //3 instances of bag object
            GenericQueue<Product> bags = new GenericQueue<Product>();

            Bag bag1 = new Bag();
            bag1.setCode("A300");
            bag1.setDescription("Prime Roller Black");
            bag1.setPrice(100.00);
            bag1.setType("Triple");
            products.add((T) bag1);
            bags.enqueue(bag1);

            Bag bag2 = new Bag();
            bag2.setCode("A200");
            bag2.setDescription("Path Pro Deluxe");
            bag2.setPrice(110.00);
            bag2.setType("Double");
            products.add((T) bag2);
            bags.enqueue(bag2);

            Bag bag3 = new Bag();
            bag3.setCode("A100");
            bag3.setDescription("Silver/Royal Blue");
            bag3.setPrice(39.99);
            bag3.setType("Single");
            products.add((T) bag3);
            bags.enqueue(bag3);

            return (GenericQueue<T>) bags;
        }

        return products;
    }
}





