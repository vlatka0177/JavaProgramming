package day39_Recap.cydeoTask;

/*
6. Create A subclass of Person named Student
    Extra variables:
                studentId, fieldOfStudy
    Encapsulate all the fields
    Add A constructor to set all the fields
    Methods:
                study()
 */

public class Student extends Person {

    private int studentId;
    private String fieldOfStudy;

    // Generate getter and setter to encapsulate all fields
    public int getStudentId() {

        return studentId;
    }

    public void setStudentId(int studentId) {

        this.studentId = studentId;
    }

    public String getFieldOfStudy() {

        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {

        this.fieldOfStudy = fieldOfStudy;
    }

    // Generate constructor
    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender);
        setStudentId(studentId); // change this.studentID = studentId to setter
        setFieldOfStudy(fieldOfStudy); // change this.fieldOfStudy = fieldOfStudy to setter
    }

    public void study() {

        System.out.println(getName() + " is studying.");
    }

    // Generate toString + copy/paste name, age, gender + add getter to these 3 variables
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
