package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "Blue", 110143);

        Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 0);

        BMW bmw = new BMW ("X5", 2021, 67000, "Grey", 80750);


        toyota.start(); // Twist the key in ignition to start Toyota Camry
        tesla.start(); // Say "Start" to start Tesla Model S
        bmw.start(); // Call mechanic to jump start BMW X5
    }
}
