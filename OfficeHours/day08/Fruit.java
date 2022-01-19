package OfficeHours.day08;

public class Fruit {

    Juice juice;

    /*     {                          // Constructor is missing
           juice = new Juice(color);
           }

           To make it work:     */

           public Fruit(String color) { // Add Fruit constructor to create a new juice object in another line
           juice = new Juice(color);   // Creating a new object by calling a juice class
            }
}

class Juice {
    String color;

    public Juice(String color) { // Juice constructor
        this.color = color;
    }


    public static void main(String[] args) {
        new Fruit("orange"); // Separate calls for Fruit and Juice
        new Juice("purple");
    }
}

