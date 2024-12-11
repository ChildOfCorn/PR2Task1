abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void start();
    public abstract void stop();

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}

interface Refuelable {
    void refuel();
}

class Car extends Vehicle implements Refuelable {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println(this + " запускається.");
    }

    @Override
    public void stop() {
        System.out.println(this + " зупиняється.");
    }

    @Override
    public void refuel() {
        System.out.println(this + " заправляється.");
    }
}

class Bike extends Vehicle {
    public Bike(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println(this + " запускається.");
    }

    @Override
    public void stop() {
        System.out.println(this + " зупиняється.");
    }
}

class Truck extends Vehicle implements Refuelable {
    public Truck(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println(this + " запускається.");
    }

    @Override
    public void stop() {
        System.out.println(this + " зупиняється.");
    }

    @Override
    public void refuel() {
        System.out.println(this + " заправляється.");
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Supra", 1995);
        Vehicle bike = new Bike("Kawasaki", "Ninja", 2021);
        Vehicle truck = new Truck("Ford", "F-150", 2023);

        car.start();
        ((Refuelable) car).refuel();
        car.stop();

        bike.start();
        bike.stop();

        truck.start();
        ((Refuelable) truck).refuel();
        truck.stop();
    }
}