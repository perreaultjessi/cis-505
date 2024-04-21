/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment6;

public class Composer
{
    private int id;
    private String name;
    private String genre;

    //default constructor
    public Composer()
    {
        this.id = 0;
        this.name = "";
        this.genre = "";
    }

    //argument constructor
    public Composer(int id, String name, String genre)
    {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    //accessor methods
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getGenre()
    {
        return genre;
    }

    //override toString method
    @Override
    public String toString()
    {
        return "Composer ID: " + id + "\nName: " + name + "\nGenre: " + genre;
    }
}
