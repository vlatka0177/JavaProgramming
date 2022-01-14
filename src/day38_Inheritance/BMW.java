package day38_Inheritance;

public class BMW extends Car {

    // Right click + Generate + Constructor
    public BMW(String model, int year, double price, String color, int miles) { // Remove String brand
        super("BMW", model, year, price, color, miles); // Insert "BMW" under brand.
    }

    public void breaksDown() {
        System.out.println(brand + " " + " breaks down.");
    }

    public void racing() {
        System.out.println(brand + " " + " is a race car.");
    }

    public void start() {
        System.out.println("Call mechanic to jump start " + brand + " " + model);

    }
}
