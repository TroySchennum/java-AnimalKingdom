package animalKingdom;

public class Mammals extends AbstractAnimal
{   
    private String name;
    

    public Mammals(String name, int year)
    {
        super(name, year);
        
    } 
    public String eatFood(){
        return "yum";
    }

    @Override
    public String move(){
        return "walk";
    }

    @Override
    public String breath(){
        return "lungs";
    }

    @Override
    public String reproduce(){
        return "live births";
    }  
        
}