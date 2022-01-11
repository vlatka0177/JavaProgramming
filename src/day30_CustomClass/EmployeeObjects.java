package day30_CustomClass;

public class EmployeeObjects {

    public static void main(String[] args) {

        /*
    CapitalOne Class:
	1. Create 5 Employee objects
	2. Store those 5 employee objects into an array
	3. How many employees are full time employees?
	4. What's the minimum salary
	5. What's the maximum salary
        */

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("David", 2025, 'M',"QA",100000,true,37);
        employee2.setInfo("Mirna",2375, 'F',"SDET",120000,true,42 );
        employee3.setInfo("Milica", 4829,'F',"Senior SDET",120000,true,38);
        employee4.setInfo("Iva",3782,'F',"SDET",100000, true,35);
        employee5.setInfo("Rechelle",3858,'F',"Lawyer",90000,true,50);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int countFullTime = 0;
        int countPartTime = 0;

        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {

            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }

            if(employee.salary > max){
                max = employee.salary;
            }
            if(employee.salary < min){
                min = employee.salary;
            }

        }

        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }

}
