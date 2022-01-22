package day05_Concatenation;

import java.sql.SQLOutput;

public class ShippingAddress {

    public static void main(String[] args) {

        String firstName = "Vlatka";
        String lastName = "Persin";
        String fullName = firstName + " " + lastName;
        int buildingNumber = 14101;
        String streetName = "Stanwood Terrace",
                apartmentNumber = "Apt. 201",
                city = "North Potomac",
                state = "Maryland";
        int zipCode = 20850;

        /*
        After first String variable, add comma. In the next line add another String variable.
        Use Escape Sequences in concatenation, such as "\n" for new line.
        Use " " to add space between variables.
         */

        String address = fullName + "\n" + buildingNumber + " " + streetName + "\n" + apartmentNumber + "\n" + city + "\n" + state + " " + zipCode;

        /*
        Store Concatenation in A String, and then print the assigned String to make it reusable.
        If stored in System.out.println, each time the data changes, one would have to create new Concatenation.
         */

        System.out.println(address);

    }
}
