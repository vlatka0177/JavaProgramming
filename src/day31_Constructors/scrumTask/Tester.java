package day31_Constructors.scrumTask;

public class Tester {

    /*
    Create A class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary
	        Add A constructor that can set all the fields
	        Actions:
	           smokeTesting(),  creatingTicket(),  toString()
    */

    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    //Right click + Generate + Constructor + Highlight
    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    //Right click + Generate + toString (uncheck Insert@Override box)
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +           // add dollar sign
                '}';
    }

    public void smokeTesting(){
        System.out.println(name + " is smoke testing.");
    }
    public void creatingTicket(){
        System.out.println(name + " is creating ticket.");
    }


}
