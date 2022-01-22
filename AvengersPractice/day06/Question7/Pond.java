package AvengersPractice.day06.Question7;

public class Pond {

    static Water water; // Has a relationship

    public Pond(String color){ // Constructor name must be the same as the class name, Pond
           water = new Water(color);
    }
}
