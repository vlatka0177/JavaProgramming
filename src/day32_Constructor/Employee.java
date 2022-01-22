package day32_Constructor;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    /* To call A constructor in another constructor
        1. this(); keyword needs to be called,so that the function can be executed.
           Constructor cannot be called by its name.
        2. Only A constructor can call another constructor.
        3. Constructor call must be at the first step.
        4. Only one constructor can be called within another constructor's body.

       this refers to the instances:
       this. calls instance variables and instance methods
       this() calls the constructors

       Constructor name has to be the same as the class name
       If the two names are the same, the parameters have to be different. */
    public Employee(String name) {

        this.name = name;
    }

    public Employee(String name, char gender) {
    this(name);  // this.name = name;
    this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle) {
        this(name,gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary) {
        this(name, gender, jobTitle);
        this.salary = salary;
    }

    /*
    public void method1(){
        this("Aaron");
    }
    */

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    /*
    public void method1(){
        System.out.println("Method 1");
    }

    public void method2(){
        method1();
    }
    */

}
