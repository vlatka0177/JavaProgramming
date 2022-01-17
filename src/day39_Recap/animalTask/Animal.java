package day39_Recap.animalTask;

public class Animal {

    /*
    Animal Task:
            1. Create a class named Animal:
               Variables: name, breed, gender, age, size, color
               Encapsulate all the fields.
               Add a constructor to set all the fields.

               Conditions:
               1. name, breed and color cannot be null (if obj == null means it's error)
               2. name, breed and color cannot be empty or cannot be blank
			   3. gender should only be set to either 'M' or 'F'
               4. age cannot be set to negative

               Methods:
               eat()
               drink()
               sleep()
               move()
               toString()
      */

    // Variables
    private String name, breed;
    private char gender;
    private int age;
    private String size, color;

    // Encapsulating all the fields with getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null) {
            System.err.println("Name cannot be null.");
            System.exit(1);
        }
        if(name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name.");
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed == null) {
            System.err.println("Breed cannot be null.");
            System.exit(1);
        }
        if(breed.isEmpty() || breed.isBlank()) {
            System.err.println("Invalid breed.");
            System.exit(1);
        }
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender.");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.err.println("Invalid age.");
            System.exit(1);
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null) {
            System.err.println("Color cannot be null.");
            System.exit(1);
        }
        if(color.isEmpty() || color.isBlank()) {
            System.err.println("Invalid color.");
            System.exit(1);
        }
        this.color = color;
    }

    // Generating a constructor to set all the fields.
    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name); // this. calls instance variable. Changing it to setter allows for the checking of conditions.
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
