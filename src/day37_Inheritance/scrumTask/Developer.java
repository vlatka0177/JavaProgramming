package day37_Inheritance.scrumTask;

public class Developer extends Employee {

    // Generate the constructor
    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }
    // method
    public void fixBugs(){
        System.out.println(jobTitle + " " + name + " is crying.");
    }
}
