package Animals.src.TownsChallange;
import Animals.src.AnimalKingdom.Animal;
import Animals.src.towns;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class TownsSort2 implements Comparator<towns>{
    public int compare(towns town1, towns town2){

        return (town1.getName().compareTo(town2.getName()));
    }
}

public class Main {
    public static void main(String[] args) {

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

        town.sort(new TownsSort2());


        // Display message only
        System.out.println("\n\nAfter Sorting:\n");

        // Iterating using enhanced for-loop
        // after Sorting ArrayList
        for (towns T : town) {
            System.out.println(T);
        }

    }
}