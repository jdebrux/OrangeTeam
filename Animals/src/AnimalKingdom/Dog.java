package Animals.src.AnimalKingdom;

public class Dog extends Animal implements LandAnimal{

    @Override
    public void speak(){
        System.out.println("I am a dog");
    }

    @Override
    public void walking(){
        System.out.println("I am walking on my paws");
    }

}
