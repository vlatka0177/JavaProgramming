package day36_Inheritance.encapsulation;

public class Student {

    /*
    1. Create A class named Student:
	   Private variables:
	   name, age, gender, grade, schoolName

	   Encapsulate all the fields (at least encapsulate two fields manually)
	   Requirements:
	   1. age should not be set less than 5 or greater than 90
	   2. gender should not be set to any character other than: 'M' and 'F'
	   3. grade should not be set to any characters other than: 'A', 'B', 'C', 'D', and 'F'

		Add A constructor that can set all the fields when the object is created
		(Requirements of fields in the above must be applied)

		Methods:
				study()
				toString()                                                  */

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public static boolean isStudent = true;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    // Right click -> Generate -> Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) { // Data type of the parameter matches the data type of the private instance variable
        this.name = name; // this keyword calls A private instance variable
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if( age < 5 || age > 90){
            return; // exits the method
        }
        this.age = age;
    }

    public char getGender() {
    return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')){
            return;   // Exits the method if the gender is invalid
        }
        this.gender = gender;
    }

    public char getGrade() {
    return grade;
    }

    public void setGrade(char grade) {
        if ( !( grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') ){
            return;
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
