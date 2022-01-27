package day39_Recap.cydeoTask;

    /*
    4. Create A subclass of Employee named Developer
       Override the work method
       Extra methods:
                fixingBugs()
     */

public class Developer extends Employee {

    // Generate constructor
    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void work() {

        System.out.println(getJobTitle() + " " + getName() + " is developing an application.");
    }

    public void fixingBugs() {

        System.out.println(getJobTitle() + " " + getName() + " is fixing bugs.");
     }

}
