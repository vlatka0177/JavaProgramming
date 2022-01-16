package day39_Recap.shapeTask;

public class Shape {

    /*
	Create class Shape
	variables: name
	Encapsulate the field
	Add a constructor to set the field.
	Methods:
		area(){}
		perimeter(){}
    */

    private String name;

    // Encapsulate the field
    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.err.println("Name cannot be null");
            System.exit(1); // status: 1 -> something went wrong
        }

        if(name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {

        setName(name);
    }

    public double area() {

        return 0;
    }

    public double perimeter() {

        return 0;
    }

    /* Right click + Generate + Override Method + toString
    @Override // Compile error for @Override because this is an overloaded method
    public String toString(int a) {
        return super.toString();
    }
    */
    // Right click + Generate + toString. Then, add area() and perimeter() with a comma + space after ".
    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
