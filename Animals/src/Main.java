package Animals.src;

import Animals.src.AnimalKingdom.Animal;
import Animals.src.AnimalKingdom.Cat;
import Animals.src.AnimalKingdom.Dog;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class TownsSort implements Comparator<towns>{

    public int compare(towns town1, towns town2){
        int nameCompare = town1.getName().compareTo(town2.getName());

        return (nameCompare);
    }


}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Animal [] animals = new Animal[2];
        animals[0] = new Dog("Puppy", 7);
        animals[1] = new Cat("Kitty", 4);
        Dog dog2 = new Dog("Doggy", 9);
        Cat cat2 = new Cat("Cat", 6 );


        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(cat2);

        System.out.println(animal.toString());

        Collections.sort(animal);

        System.out.println(animal.toString());

//        for (int i =0; i<animals.length; i++){
//            animals[i].speak();
//        }




//            HashMap<String, String> towns = new HashMap<String, String>();
//            towns.put("Croydon", "Greater London");
//            towns.put("New Castle", "Tyne Werar");
//            towns.put("Southampton", "Hampshire");
//            towns.put("Bristol", "South West");
//            towns.put("Sheffield", "South Yorkshire");
//            towns.put("Liverpool", "Merseyside");
//
//
//        animal.add(animals[0]);
//        animal.add(animals[1]);
//        animal.add(dog2);
//
//            List<Map.Entry<String, String>> list = new ArrayList<>(towns.entrySet());
//            Collections.sort(list, Map.Entry.comparingByValue());


        List<towns> town = new ArrayList<>();

        town.add(new towns("Edenbridge", "kent"));
        town.add(new towns("YourTown", "YourCounty"));
        town.add(new towns("East Grinstead", "Sussex"));
        town.add(new towns("MyTown", "MyCounty"));


        Iterator<towns> custIterator = town.iterator();


        // Display message
        System.out.println("Before Sorting:\n");

        // Holds true till there is single element
        // remaining in List
        while (custIterator.hasNext()) {

            // Iterating using next() method
            System.out.println(custIterator.next());
        }

        Collections.sort(town, new TownsSort());


        // Display message only
        System.out.println("\n\nAfter Sorting:\n");

        // Iterating using enhanced for-loop
        // after Sorting ArrayList
        for (towns T : town) {
            System.out.println(T);
        }

    }
}