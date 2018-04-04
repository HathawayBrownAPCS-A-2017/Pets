public class PetCow extends Cow implements Pet
{
    private String name;
    
    public PetCow ()
    {
        super();
        name = "Anne Onymous";
    }
    
    public PetCow (String s)
    {
        super();
        name = s;
    }
    
    public String getName ()
    {
        return name;
    }
    
    public void setName (String s)
    {
        name = s;
    }
    
    public void play()
    {
        System.out.print ("Just tip me over!  Almost as much fun as a fainting goat.");
    }
}