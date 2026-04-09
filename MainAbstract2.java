abstract class VehicleVinyaa {
    abstract void start();
    abstract void stop();

    void fuelType() {
        System.out.println("Fuel type varies");
    }
}

// Car class
class Car51 extends VehicleVinyaa {
    void start() {
        System.out.println("Car starts with key or button");
    }

    void stop() {
        System.out.println("Car stops using brakes");
    }
}

// Bike class
class Bike51 extends VehicleVinyaa {
    void start() {
        System.out.println("Bike starts with kick or self-start");
    }

    void stop() {
        System.out.println("Bike stops using hand brake");
    }
}

public class MainAbstract2{
    public static void main(String[] args) {
        VehicleVinyaa v;

        v = new Car51();
        v.start();
        v.stop();
        v.fuelType();

        v = new Bike51();
        v.start();
        v.stop();
        v.fuelType();
    }
}