package day33_Statics;

public class Student {

    /*
    Student Task:
    1. Create A class called Student:

    Attributes: name, gender, age, studentID, grade

    Add A constructor that allows user to create object by setting the name of student

    Add A constructor that allows user to create object by setting the name and gender of the student

    Add A constructor that allows user to create object by setting the name and studentID of the student

    Add A constructor that allows user to create object by setting the name, studentID and grade of the student

    Add A constructor that allows user to create object by setting the name, gender and age of the student

    Add A constructor that allows user to create object by setting the name, gender, age and studentID of the student

    Add A constructor that allows user to create object by setting the name, gender, age, studentID and grade of the
       student

   Actions:
      toString()
      study()
     */

    public String name;  // instance variables because 100 students with 100 different names
    public char gender;
    public int age;
    public int studentId;
    public char grade;

    public Student(String name){  // right click + generate + constructor + highlight only name + OK

        this.name = name;
    }

    public Student(String name, char gender){  // overloading: same method name, but different parameters
        this(name);  // constructor call has to happen in the first step
        this.gender = gender;
    }

    public Student(String name, int studentId){
        this(name);
        this.studentId = studentId;
    }

    public Student(String name, int studentId, char grade){
        this(name, studentId);
        this.grade = grade;
    }

    public Student(String name, char gender, int age){
        this(name, gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentId){
        this(name, gender, age);
        this.studentId = studentId;
    }

    public Student(String name, char gender, int age, int studentId, char grade) {  // generate constructor highlight OK
        this( name, gender, age, studentId); // control + space inside the bracket -> suggestions
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }

}
