package day37_Inheritance.animalTask;

public class Animal {

        public String name, breed;
        public char gender;
        public int age;
        public String size;
        public String color;

    // Right click + generate + constructor + highlight + OK
    public Animal(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }
    // If the constructor is not called, the default constructor will be called.

    public void eat() {

        System.out.println(name + " is eating.");
    }
    public void drink() {

        System.out.println(name + " is drinking.");
    }
    public void move() {

        System.out.println(name + " is moving.");
    }
    public void sleep() {

        System.out.println(name + " is sleeping.");
    }

    // Right click + Generate + toString + uncheck insert @Override + OK
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
