/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment6;

import java.util.Scanner;

public class TestComposerApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        MemComposerDao composerDao = new MemComposerDao();

        int choice;
        do {
            System.out.println("Welcome to the Composer App\n");
            System.out.println("MENU OPTIONS");
            System.out.println("       1. View Composers");
            System.out.println("       2. Find Composer");
            System.out.println("       3. Add Composer");
            System.out.println("       4. Exit\n");
            System.out.print("Please choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.println("\n--DISPLAYING COMPOSERS--");
                    displayComposers(composerDao);
                    break;
                case 2:
                    System.out.println("\n--FIND COMPOSER--");
                    findComposer(scanner, composerDao);
                    break;
                case 3:
                    System.out.println("\n--ADD COMPOSER--");
                    addComposer(scanner, composerDao);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Unexpected value. Please enter a number from 1 to 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void displayComposers(MemComposerDao composerDao)
    {
        for (Composer composer : composerDao.findAll())
        {
            System.out.println(composer);
        }
    }

    private static void findComposer(Scanner scanner, MemComposerDao composerDao)
    {
        System.out.print("Enter the composer ID: ");
        int id = scanner.nextInt();
        Composer composer = composerDao.findBy(id);
        if (composer != null)
        {
            System.out.println("Composer found:");
            System.out.println(composer);
        } else
        {
            System.out.println("Composer not found.");
        }
    }

    private static void addComposer(Scanner scanner, MemComposerDao composerDao)
    {
        System.out.print("Enter an id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        System.out.print("Enter a genre: ");
        String genre = scanner.nextLine();

        Composer newComposer = new Composer(id, name, genre);
        composerDao.insert(newComposer);
        System.out.println("Composer added to database.");
    }
}
