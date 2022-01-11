package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    /*
    Generating setInfo Method to set attributes of the Custom Class
    Right click. Generate. Constructor. Select/highlight all. OK
    */

    public void setInfo(String name, char gender, int age, int ID, char grade) {

        /*
        this. keyword is used for calling the instance variable when the instance variable has the same name
        as the local variable
        */

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

        public void code() {
        System.out.println(name + " is coding.");
        }

        public void sleep() {
        System.out.println(name + " is sleeping.");
        }

}
