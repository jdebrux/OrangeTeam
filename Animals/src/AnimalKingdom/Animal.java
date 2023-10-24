package Animals.src.AnimalKingdom;

public abstract class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    public Animal(){

    }

    @Override
    public String toString(){
        return name + " " + age;

    }


    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println("I am an animal");
    }

    @Override
    public int compareTo(Animal a) {
        return name.compareTo(a.name);
    }
}
