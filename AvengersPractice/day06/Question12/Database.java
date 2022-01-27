package AvengersPractice.day06.Question12;

public class Database {

    private String name; // Cannot call an instance variable from inside the static method

    public String getName(){ // change the public static String method to instance method by deleting static

        return name;
    }

    public void setName (String name) {

        this.name = name;
    }
}
