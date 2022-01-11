package day32_Constructor;

public class Carpet {

    /*
    1.Carpet Task:
		1.1 create a custom class for the Carpet class that should contain the following:
                Attributes:
                        width, length, unitPrice, isPersian (boolean)
				Add a constructor to set all the instances
                Actions:
                    calcCost(): should be able to calculate the total cost of the carpet and return it as double
                    toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length) * unitPrice
            if the carpet is persian  carpet, add 200$ to the totalPrice
     */

    // Public access modifier allows access inside and outside this package.
    public double width, length, unitPrice; // Declaring instance variable
    public boolean isPersian;

    /* Right click + Generate + Constructor + Highlight + OK
       Constructor name has to be the same as the class name
              |                                           */
    public Carpet(double width, double length, double unitPrice, boolean isPersian) { // Constructor with arguments
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    } /*         |          |
         instance variable  local variable    */

    // All information is already given in the instance of this class, so no need to pass any additional parameters
    public double calcCost() {
        double totalPrice = (width * length) * unitPrice;

        if(isPersian){
            totalPrice += 200; // totalPrice = totalPrice + 200
        }
        return totalPrice;
    }
    /* Right click + Generate + toString() + Highlighted instance variables + uncheck Insert@Override + OK
       Modify toString() by inserting total price and calling calcCost() method                                                      */
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calcCost() +
                '}';

        // Split screen. Create new class. Right-click on a class tab on top of the page + Split Right
    }
}


