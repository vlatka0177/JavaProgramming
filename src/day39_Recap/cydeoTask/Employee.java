package day39_Recap.cydeoTask;

        /*
        2. Create A subclass of Person named Employee:
        Extra variables: employeeId, jobTitle, salary
        Encapsulate all the fields
        Add A constructor to set all the fields
        Methods:
        work()
        toString()
        */

public class Employee extends Person {

    private int employeeID;
    private String jobTitle;
    private double salary;

    // Encapsulate all the fields
    public int getEmployeeID() { // Right click + Generate getters and setters

        return employeeID;
    }

    public void setEmployeeID(int employeeID) {

        this.employeeID = employeeID;
    }

    public String getJobTitle() {

        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        this.jobTitle = jobTitle;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    /* Add A constructor to set all the fields.
       Right click + Generate constructor to encapsulate all the fields */
    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID); // Change this.employeeID = employeeID to setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    // Right click + Generate toString + copy/paste name, age, gender + modify getName(), getAge(), getGender()
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

