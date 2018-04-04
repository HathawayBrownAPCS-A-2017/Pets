
public class PetFish extends Fish implements Pet
{
    private String name;
    
    public PetFish ()
    {
        super();
        name = "Anne Onymous";
    }
    
    public PetFish (String s)
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
        System.out.print ("Blub.  Blub.  Isn't this fun?");
    }
}