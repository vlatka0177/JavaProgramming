package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        //hourly rate, weekly hours

        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeeks = 52;
        int salary = hourlyRate * weeklyHours * numberOfWeeks;

        System.out.println(salary);
        System.out.println("hourlyRate = $" + hourlyRate); //concatenation
        System.out.println("weeklyHOurs = " + weeklyHours);
        System.out.println("numberOfWeeks =" + numberOfWeeks);
        System.out.println("salary = $" + salary);

    }
}
