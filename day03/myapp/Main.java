package myapp;

public class Main {
    
    public static void main(String[] args) {

        // instantiate a car
        //Declare a variable
        Car myCar = new Car();
        myCar.setColour("red");
        //myCar.colour = "red";
        //myCar.make = "honda";
        //myCar.enginecapacity = 2000;

        myCar.start();

        System.out.printf("The colour of the car is %s\n", myCar.getColour);

        myCar.setColour("blue");
        System.out.printf("The colour of the car has been changed to %s\n", myCar.getColour);


        //instantiate another car

        Car mySecondCar = new Car();
        //myCar.colour = "green";
        //myCar.make = "toyota";
        //myCar.enginecapacity = 1500;

        mySecondCar.stop();

        //Honda
        Honda civic = new Honda();
        System.out.printf("Make of car: %s\n", civic.getMake();
        civic.accelerate();
        civic.stop();

        )
    }
}
