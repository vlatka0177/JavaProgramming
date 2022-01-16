package day39_Recap.cydeoTask;

/*
5. Create a subclass of Employee named Teacher
   Override the work method
 */

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is teaching");
    }
}
