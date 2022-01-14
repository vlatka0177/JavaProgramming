package day38_Inheritance.carTask;

import day38_Inheritance.carTask.Car;

public class Toyota extends Car {

    // Right click + Generate + Constructor
    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable() {
        System.out.println(brand + " " + " is reliable.");
    }

    public void start() { // Blue circle on the left signals that this is an Override Method
        System.out.println("Twist the key in ignition to start " + brand + " " + model);

    }
}
