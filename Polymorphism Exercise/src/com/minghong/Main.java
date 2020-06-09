package com.minghong;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}
class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}
class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "-> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> brake()";
    }
}
public class Main {

    public static void main(String[] args) {
	    //Create a base class called Car
        //It should have a few fields that would be appropriate for a generic car class
        //engine, cylinders, wheels, etc
        //Constructor should initialize cylinders (number of) and name, and set wheels to 4
        //and engine to true. Cylinders and names would be passed parameters
        //
        //Create appropriate getters
        //
        //Create some methods like startEngine, accelerate, and brake
        //
        //show a message for each in the base class
        //Now create 3 sub classes for your favorite vehicles
        //Override the appropriate methods to demonstrate polymorphism in use.
        //Put all classes in one java file
        Car car = new Car(8,"Base car");
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.startEngine());

        Mitsubishi mitsubishi = new Mitsubishi(10,"Outlander");
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println(mitsubishi.startEngine());

        Ford ford = new Ford(12,"Falcon");
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println(ford.startEngine());

        Holden holden = new Holden(9,"Holden Commodore");
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
        System.out.println(holden.startEngine());
    }
}
