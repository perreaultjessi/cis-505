/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment6;

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao
{
    private List<Composer> composers;

    //default constructor
    public MemComposerDao()
    {
        //default composer list
        composers = new ArrayList<>();
        composers.add(new Composer(2046, "Composer 1", "Classical"));
        composers.add(new Composer(2047, "Composer 2", "Rock"));
        composers.add(new Composer(2048, "Composer 3", "Country"));
        composers.add(new Composer(2049, "Composer 4", "Disco"));
        composers.add(new Composer(2050, "Composer 5", "Indie"));
    }

    //overridden findAll method
    public List<Composer> findAll()
    {
        return composers;
    }

    //overridden findBy method
    public Composer findBy(int id)
    {
        for (Composer composer : composers)
        {
            if (composer.getId() == id)
            {
                return composer;
            }
        }
        return null; //return null if no composer matches given id
    }

    //overridden insert method
    public void insert(Composer newComposer)
    {
        composers.add(newComposer);
    }
}
