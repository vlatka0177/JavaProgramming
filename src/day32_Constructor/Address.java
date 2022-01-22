package day32_Constructor;

public class Address {

   /*
   2. Address Task:
      Create A class named Address
      Attributes: buildingNumber, street, city, state, zipCode;

      Add A constructor to set all the fields

      Actions
      toString: returns the address
      EX:
      7925 Jones Branch Dr
      McLean
      Va, 22012                                                       */


    public int buildingNumber;
    public String street, city, state;
    public int zipCode;

    public Address(int buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return  " " + buildingNumber +
                " " + street + '\n' +
                " " + city + '\n' +
                " " + state +
                ", " + zipCode;
    }

}
