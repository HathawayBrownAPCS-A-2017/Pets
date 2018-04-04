public class PetLizard extends Lizard implements Pet
{
    private String name;
    
    public PetLizard ()
    {
        super();
        name = "Anne Onymous";
    }
    
    public PetLizard (String s)
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
        System.out.print ("Watch me stick out my tongue!");
    }
}
