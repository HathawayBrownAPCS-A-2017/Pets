
/**
 * Implements a list of Animals as an ArrayList
 *
 * @author Michael Buescher for APCS
 * @version Unit 2
 */

import java.util.ArrayList;

public class PetList
{

    /**
     * Makes a list of Animals!
     */
    public static void main (String[] args)
    {
        ArrayList<Pet> myList = new ArrayList<Pet>();
        
        myList.add(new PetLizard("Lizzie"));
        myList.add(new PetCow("Bessie"));
        myList.add(new PetFish());
        
        for (Pet p : myList)
        {
            System.out.print("This is my pet, " + p.getName() + ".\t");
            p.play();
            System.out.println();
        }
    }
}
