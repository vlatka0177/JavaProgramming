package day38_Inheritance;

public class Tesla extends Car{

    // Right click + Generate + Constructor
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot() {
        System.out.println(brand + " " + " has autopilot.");
    }

    // Right click + Generate + Override Methods + start():void + OK
    @Override
    public void start() {
        super.start();
    }
}
