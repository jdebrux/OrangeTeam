package Animals.src.AnimalKingdom;

public class Dog extends Animal implements LandAnimal{

//    public String name;

//    @Override
//    public String toString(){
//        return name;
//    }

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void speak(){
        System.out.println("I am a dog");
    }

    @Override
    public void walking(){
        System.out.println("I am walking on my paws");
    }

}
