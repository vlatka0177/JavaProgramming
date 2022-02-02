package day43_Abstraction.Car;

public class CarShop {

    public static void main(String[] args) {

        /*
        Car car1 = new Car("Cydeo", "25", "blue", 2022, 100000);
        Abstract class cannot have objects. Only concrete class can have objects.
        Abstract class can have abstract method, which needs to be overridden.
         */

        Honda honda = new Honda("Accord", "black", 2019, 30000);
        Audi audi = new Audi("Q7", "blue", 2020, 45000);
        Tesla tesla = new Tesla("Model3", "white", 2021, 50000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-------------------------------------------------------------------------------------");

        honda.setColor("red");
        audi.setColor("pink");
        tesla.setColor("green");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


    }
}
