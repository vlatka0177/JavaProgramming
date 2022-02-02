package day43_Abstraction.Car;

public final class Tesla extends Car{ // Other classes cannot extend Tesla class

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void start() {
        System.out.println("Say \"start\"");
    }

    public void autoPilot() {
        System.out.println(getBrand() + getModel() + " has auto pilot feature.");
    }
}
