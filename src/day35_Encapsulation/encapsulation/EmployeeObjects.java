package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Marko",'M',27,100000);
        employee1.setAge(28);

        Employee employee2 = new Employee("Sandra", 'F', 31, 115000);
        employee2.setName("Elvira");
        employee2.setSalary(employee2.getSalary() + 15000);

        System.out.println(employee1);
        System.out.println(employee2);

    }
}
