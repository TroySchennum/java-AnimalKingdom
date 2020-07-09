package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static List<AbstractAnimal> filteredList = new ArrayList<>();

	public static void filterAnimal(List<AbstractAnimal> animals, CheckAnimal tester)
	{
		filteredList.clear();

        for (AbstractAnimal v : animals)
        {
        	if (tester.test(v))
        	{
        		
        		filteredList.add(v);
        	}
        }
	}
    
    public static void main(String[] args) {

        Mammals Panda = new Mammals("Panda", 1869);

        System.out.println("name " + Panda.getName() + " year " + Panda.year);

        Mammals Zebra = new Mammals("Zebra", 1778);

        Mammals Koala = new Mammals("Koala", 1816);

        Mammals Sloth = new Mammals("Sloth", 1804);

        Mammals Armadillo = new Mammals("Armadillo", 1758);

        Mammals Raccoon = new Mammals("Raccoon", 1758);

        Mammals Bigfoot = new Mammals("Bigfoot", 2021);

        Birds Pigeon = new Birds("Pigeon", 1837);

        Birds Peacock = new Birds("Peacock", 1821);

        Birds Toucan = new Birds("Toucan", 1758);

        Birds Parrot = new Birds("Parrot", 1824);

        Birds Swan = new Birds("Swan", 1758);

        Fish Salmon = new Fish("Salmon", 1758);

        Fish Catfish = new Fish("Catfish", 1817);

        Fish Perch = new Fish("Perch", 1758);

        List<AbstractAnimal> myList = new ArrayList<>();
        myList.add(Panda);
        myList.add(Zebra);
        myList.add(Koala);
        myList.add(Sloth);
        myList.add(Armadillo);
        myList.add(Raccoon);
        myList.add(Bigfoot);
        myList.add(Pigeon);
        myList.add(Peacock);
        myList.add(Toucan);
        myList.add(Parrot);
        myList.add(Swan);
        myList.add(Salmon);
        myList.add(Catfish);
        myList.add(Perch);

        System.out.println();
        System.out.println(myList);

        System.out.println("\n*** MVP ***");

        System.out.println("\n*** List all the animals in descending order by year named ***");
        myList.sort((v1, v2) -> v2.getYear() - v1.getYear());

        System.out.println(myList);
        System.out.println();

        System.out.println("\n*** List all the animals alphabetically ***");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        
        System.out.println(myList);
        System.out.println();

        System.out.println("\n*** List all the animals order by how they move ***");
        myList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        
        System.out.println(myList);
        System.out.println();
        
        System.out.println("\n*** List all the animals order by how they breathe with lungs ***");
        filterAnimal(myList, v -> v.breath().equals ("lungs"));
        
        
        System.out.println(filteredList);
        System.out.println();

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        
        filterAnimal(myList, v -> (v.breath().equals ("lungs")) && (v.getYear() == (1758)));
        
        
        System.out.println(filteredList);
        System.out.println();

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        
        filterAnimal(myList, v -> (v.breath().equals ("lungs")) && (v.reproduce().equals ("eggs")));
        
        
        System.out.println(filteredList);
        System.out.println();

        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        
        filterAnimal(myList, v -> (v.getYear() == (1758)));
        filteredList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        
        filteredList.forEach((v) -> System.out.println(v.getName()+ " " + v.reproduce() + " " + v.move() + " " + v.breath() + " " + v.getYear()));
        System.out.println();
        
    }
}