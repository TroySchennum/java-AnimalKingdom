package animalKingdom;

public class Birds extends AbstractAnimal
{
    private String name;
    

    public Birds(String name, int year)
    {
        super(name, year);
        
    } 
    public String eatFood(){
        return "yum";
    }

    @Override
    public String move(){
        return "fly";
    }

    @Override
    public String breath(){
        return "lungs";
    }

    @Override
    public String reproduce(){
        return "eggs";
    }  

   
        
}