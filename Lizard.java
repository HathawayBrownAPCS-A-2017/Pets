
/**
 * A lizard is a type of animal
 *
 * @author Snow
 * @version 2017-09-14
 */
public class Lizard extends Animal
{    
    /**
     * Constructor for objects of class Lizard - does nothing
     */
    public Lizard()
    {
        setSpecies ("Lizard");
    }

    /**
     * Prints a message about eating food!
     */
    public void eat()
    {
        System.out.print ("Crickets taste delicious!    ");
    }
    
    /**
     * Prints a message about making a sound!
     */
    public void speak()
    {
        System.out.print ("*silence*    ");
    }
}
