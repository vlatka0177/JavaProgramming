package day35_Encapsulation.encapsulation;

public class Person {

    private String name;
    private int age;

    // Getter Method - Read
    public String getName(){  // Encapsulating unique data (camelCase), the private instance variable
        return name; // Return type must match the data type of the private instance variable
    }

    // Setter Method - Write/Modify
    public void setName(String name){ // Encapsulating unique data, the private instance variable
        this.name = name; // Parameter has to match the private instance variable
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age <= 0){
            System.err.println("Invalid Age: " + age);
            System.exit(0);
        }
        this.age = age;
    }
}
