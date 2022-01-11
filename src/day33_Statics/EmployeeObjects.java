package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Tamara";
        employee1.salary = 110000;

        Employee employee2 = new Employee();
        employee2.name = "Martin";
        employee2.salary = 115000;

        Employee employee3 = new Employee();
        employee3.name = "Emilie";
        employee3.salary = 120000;

        System.out.println(employee1.name);  // Static: Emilie  Instance: Tamara
        System.out.println(employee2.name);  // Static: Emilie  Instance: Martin
        System.out.println(employee3.name);  // Static: Emilie  Instance: Emilie

        /*
        Static prints only the last value for all the objects
        Instance prints three different names for three objects
        */

        System.out.println(employee1.name +  " : " + employee1.salary);
        // Static: Tamara: 120000.0  Instance: Tamara: 110000.0

        System.out.println(employee2.name +  " : " + employee2.salary);
        // Static: Martin: 120000.0  Instance: Martin: 115000.0

        System.out.println(employee3.name +  " : " + employee3.salary);
        // Static: Emilie: 120000.0  Instance: Emilie: 120000.0

        System.out.println( employee1.isHuman ); // true
        System.out.println( employee2.isHuman ); // true
        System.out.println( employee3.isHuman ); // true

        int a = 100;
        a = 200;
        a = 300;
        System.out.println(a);


    }
}
