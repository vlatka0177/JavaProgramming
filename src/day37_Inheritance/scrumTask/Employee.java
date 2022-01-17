package day37_Inheritance.scrumTask;

    /*
    name, gender, age, jobTitle, id, salary, companyName
    work(), toString()
    */

public class Employee extends Person { // Employee Is A Person

    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;

    // Generate constructor after Employee class 'extends Person'
    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work() {
        System.out.println(jobTitle + " " + name + " is working.");
    }

    // Generate toString() to include all instances
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}


