public class Vehicle {
    private String make;

    private String model;
    private String vehicle_type;


    public Vehicle(String make, String model, String vehicle_type)
    {
        this.make = make;
        this.model = model;
        this.vehicle_type = vehicle_type;
    }

    //Vehicle in motion
    public void getMotion(){
        System.out.println("The vehicle is moving. ");
    }


}

class Car extends Vehicle{
    private int numberOfDoors;


    public Car(String make, String model, String vehicle_type, int numberOfDoors){
        super(make, model, vehicle_type);
        this.numberOfDoors = numberOfDoors;
    }

    //Car is driving

    @Override
    public void getMotion() {
        System.out.println("The car is driving on the road. ");
    }

}


class Bike extends Vehicle{
    private int numberOfWheels;


    public Bike(String make, String model, String vehicle_type, int numberOfWheels){
        super(make, model, vehicle_type);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void getMotion() {
        System.out.println("The bike is driving on the road. ");
    }


    public static void main(String[] args) {

        Bike bike1 = new Bike("Harley Davidson", "Loud", "Motorbike", 2);
        Bike bike2 = new Bike("Trek", "Mountain", "Bicycle", 2);
        Car car1 = new Car("BMW", "320d", "Saloon", 5);
        Car car2 = new Car("Mercerdes", "A-class", "Hatchback", 3);

        Vehicle[] vehicles = {bike1, bike2, car1, car2};
        for (Vehicle v : vehicles) {
            v.getMotion();
        }
        ;
    }

}


