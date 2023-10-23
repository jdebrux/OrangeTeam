package Animals.src.AnimalKingdom;

public abstract class Animal {
    private String name;

    public Animal(){

    }

    public Animal(String name){
        this.name = name;
    }

    public void speak(){
        System.out.println("I am an animal");
    }
}
