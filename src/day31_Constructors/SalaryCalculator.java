package day31_Constructors;

public class SalaryCalculator {

    /*
    1. SalaryCalculator Task:
		1.1 Create A class named SalaryCalculator:
		    Attributes:
		    hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	        Add A constructor to set all the fields

		    Actions:
		    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		    stateTax(): calculates the total state tax
		    federalTax(): calculates the total federal tax
		    salaryAfterTax(): calculates the salary after tax
		    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
      */

    public int hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public double weeklyHours;

    public SalaryCalculator(int hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary() {
        return 52 * (hourlyRate * weeklyHours);
    }
    public double stateTax() {
        return (salary() * stateTaxRate) / 100;
    }
    public double federalTax() {
        return (salary() * federalTaxRate) / 100;
    }
    public double salaryAfterTax() {
        return salary() - (stateTax() + federalTax());
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary= $" + salary() +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salaryAfterTax= $" + salaryAfterTax() +
                '}';
    }
}

