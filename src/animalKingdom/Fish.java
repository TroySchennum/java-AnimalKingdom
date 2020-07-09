package animalKingdom;

public class Fish extends AbstractAnimal
{
    private String name;
    

    public Fish(String name, int year)
    {
        super(name, year);
        
    } 
    public String eatFood(){
        return "yum";
    }

    @Override
    public String move(){
        return "swim";
    }

    @Override
    public String breath(){
        return "gills";
    }

    @Override
    public String reproduce(){
        return "eggs";
    }
    
  
}