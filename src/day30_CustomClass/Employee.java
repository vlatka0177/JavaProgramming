package day30_CustomClass;

public class Employee {

    /*
    Employee Class:
		Attributes:
			name, ID, gender, jobTitle, salary, isFullTime(boolean), age
		Actions:
			toString(): to be able to print each employee object
			setInfo(): to be able to set all the attributes
			work()...
    */

    public String name;
    public int ID;
    public char gender;
    public String jobTitle;
    public int salary;
    public boolean isFullTime;
    public int age;

    // setInfo Method shortcut
    public void setInfo(String name, int ID, char gender, String jobTitle, int salary, boolean isFullTime, int age) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.age = age;
    }

    // toString Method shortcut (Check off insert@Override)

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", age=" + age +
                '}';
    }

    public void work() {
        System.out.println(jobTitle + " " + name + " is working");
    }

}
