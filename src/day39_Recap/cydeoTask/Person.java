package day39_Recap.cydeoTask;

/*
1. Create a class named Person:
   Variables: name, age, gender
   Encapsulate all the fields
   Add a constructor to set all the fields
   Methods:
                eat()
                drink()
                sleep()
                toString()
 */

public class Person {

    private String name;
    private int age;
    private char gender;

    // Generate getters and setters to encapsulate all the fields
    public String getName() { // Right click + Generate + Getter and Setter + Highlight name, age, gender + OK

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public char getGender() {

        return gender;
    }

    public void setGender(char gender) {

        this.gender = gender;
    }

    // Add a constructor to set all the fields
    // Right click + Generate + Constructor + Highlight name, age, gender + OK
    public Person(String name, int age, char gender) {
        setName(name); // Change this.name = name; to setName(name);
        setAge(age); // Change this.age = age; to setAge(age);
        setGender(gender); // Change this.gender = gender; to setGender(gender);
    } // Setter is preferred because it can check conditions (age range, name starting with a letter etc.)

    public void eat(){

        System.out.println(name+" is eating");
    }

    public void drink(){

        System.out.println(name+" is drinking");
    }

    public void sleep(){

        System.out.println(name+" is sleeping");
    }

    public String toString() { // Right click + Generate + toString + Highlight name, age, gender + OK
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
