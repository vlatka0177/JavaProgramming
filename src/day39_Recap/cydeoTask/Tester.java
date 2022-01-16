package day39_Recap.cydeoTask;

       /*
        3. Create a subclass of Employee named Tester
        Override the work method
        Extra methods:
        createTicket()
        */

public class Tester extends Employee{

    // Generate constructor
    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle() + " " + getName() + " is creating ticket");
    }

    public void work() {
        System.out.println(getJobTitle()+ " " + getName() + " is testing the application");
    }

}
