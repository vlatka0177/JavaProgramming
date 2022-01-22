package day35_Encapsulation;

public class Person {

    /*
    2. Create A class named Person:

       Variables: name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

       Add A constructor to initialize all the fields

       Add A static block to initialize all the statics

       Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
     */

    // Local variables
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfHeads, numberOfWings;

    public Person(String name, int age, char gender, String language) { // Instance variables
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

        static{
          planet = "Earth";
          isHuman = true;
          hasNose = true;
          numberOfHeads = 1;
          numberOfWings = 0;
        }

        public static void printPlanetName() {

        System.out.println("Planet name is " + planet);
        }

        public void eat(String food) {

        System.out.println(name + " is eating " + food);
        }

        public void drink(String drink) {

        System.out.println(name + " is drinking " + drink);
        }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
