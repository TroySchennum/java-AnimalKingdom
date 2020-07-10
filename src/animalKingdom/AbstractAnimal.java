package animalKingdom;

abstract class AbstractAnimal
{   
    protected static int maxId = 0;

    abstract String eatFood();
    abstract String move();
    abstract String breath();
    abstract String reproduce();
    protected String name;
    protected int year;
    protected int id;
    

    public AbstractAnimal(String name, int year){
        maxId++;
        id = maxId;

        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    @Override
	public String toString()
	{
		return "id = " + id + " name = " + name + " yearNamed= " + year;
	}
}