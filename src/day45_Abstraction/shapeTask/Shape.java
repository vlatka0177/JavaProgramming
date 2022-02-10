package day45_Abstraction.shapeTask;

public abstract class Shape {

    private final String name;

    // Parent class provides variables and methods. Child class implements these variables and methods.

    // Generate a constructor
    public Shape(String name) {
        // this.name = name                      // Option 1
        this.name = getClass().getSimpleName();  // Option 2
    }

    public String getName() { // final can generate only a getter, not a setter

        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    // Generate toString method
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +        // Delete "Shape". Insert getClass().getSimpleName()
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +             // Add area
                ", perimeter='" + perimeter() + '\'' +   // Add perimeter
                '}';
    }
}
