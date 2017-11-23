package org.fasttrackit;


public class App {
    public static void main(String[] args) {

        Track track = new Track();
        track.setLength(100);


        Engine engine = new Engine();
        engine.setManufacturer("Volvo");

        Car car1 = new Car(engine);
        car1.setName("Volvo");
        car1.setColor("Black");
        car1.setFuelLevel(100.0);
        car1.setMileage(12.5);
        car1.setDoorCount(4);


        Engine engine2 = new Engine();
        engine2.setManufacturer("Honda");

        Car car2 = new Car(engine2);
        car2.setName("Honda");
        car2.setColor("Red");
        car2.setFuelLevel(100.0);
        car2.setMileage(13.5);
        car2.setDoorCount(2);




        Vehicle vehicle = new Vehicle();
        vehicle.accelerate(20.5);

        AutoVehicle autoVehicle = new AutoVehicle(new Engine());




    }
}
