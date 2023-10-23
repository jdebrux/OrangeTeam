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

    //Car is driving

    @Override
    public void getMotion() {
        System.out.println("The bike is driving on the road. ");
    }





}


