package day30_CustomClass;

public class Car {

    // Each car object has different attributes: brand, model, color, year, price
    public String brand;
    public String model;
    public String color;
    public int year;
    public int price;

    // setInfo Method
    public void setInfo(String carBrand, String carModel, String carColor, int carYear, int carPrice) {
        // 5 parameters (arguments) for 5 attributes
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    /*
    Generating toString Method
    Right click. Generate. toString(). Uncheck the box in the bottom left.
    */
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void drive(){

        System.out.println("Driving "+ brand + " " + model);
    }

    public void start(){

        System.out.println(brand + " " + model + " has started");
    }

    public void stop(){

        System.out.println(brand + " " + model + " has stopped");
    }

}


