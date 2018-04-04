
/**
 * This is a generic Animal.  You will write some inherited Animals!
 *
 * @author Michael Buescher & APCS-2017
 * @version  Unit 2
 */
public abstract class Animal
{
    private String species;

    /**
     * Constructor for objects of class Animal - does nothing
     */
    public Animal()
    {
        species = "Unknown species.";
    }

    public String getSpecies ()        { return species; }
    public void setSpecies (String s)  { species = s; }
    
    /**
     * Makes a nice friendly greeting
     */
    public void greeting()
    {
        System.out.print ("Hello there! I'm a " + species + ".\t");
    }
    
    /**
     * Prints a message about eating food!
     */
    public abstract void eat();
    
    /**
     * Prints a message about making a sound!
     */
    public abstract void speak();

}
