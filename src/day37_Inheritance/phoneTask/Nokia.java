package day37_Inheritance.phoneTask;

/*
1.4 Create a subclass of Phone named Nokia:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    selfDefense()
                    toString()
 */

public class Nokia extends Phone {

    public Nokia(String brand, String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense(){
        System.out.println("You can use "+brand+" "+model+" as self defense tool");
        }

    }



