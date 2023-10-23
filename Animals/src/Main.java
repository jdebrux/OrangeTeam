package Animals.src;

import Animals.src.AnimalKingdom.Animal;
import Animals.src.AnimalKingdom.Cat;
import Animals.src.AnimalKingdom.Dog;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Animal [] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (int i =0; i<animals.length; i++){
            animals[i].speak();
        }
    }
}