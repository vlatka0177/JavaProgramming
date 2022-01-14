package day39_Recap;

public class Shape {

    private String name;

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

    public double
}
