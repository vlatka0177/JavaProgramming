package day32_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Milvia");

        Employee employee2 = new Employee("Tanja", 'F');

        Employee employee3 = new Employee("Sonja",'F',"SDET");

        Employee employee4 = new Employee("Svilen", 'M', "HVAC Engineer", 120000);

        System.out.println(employee1);

        System.out.println(employee2);

        System.out.println(employee3);

        System.out.println(employee4);

    }
}
