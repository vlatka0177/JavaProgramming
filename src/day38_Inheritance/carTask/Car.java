package day38_Inheritance.carTask;

public class Car {

    /*
    Create A class called Car
	Instance variables: brand, model, year, price, color, miles
	Add A constructor to set all the fields
	Instance methods: start(), drive(), toString()
    */

    // Instance variables
    public String brand, model;
    public int year;
    public double price;
    public String color;
    public int miles;

    // Right click + generate + constructor + highlight + OK
    public Car(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public void start() {
        System.out.println(brand + " " + model + " is starting.");
    }

    public void drive() {
        System.out.println(brand + " " + model + " is driving.");
    }

    /*
    public void fly(){
    }

    fly() is not common for all the cars, and parent class should only contain the common feature of all the subclasses
    */

    // Right click + Generate + toString + uncheck insert @Override + OK
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
