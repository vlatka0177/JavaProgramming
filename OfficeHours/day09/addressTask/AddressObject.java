package OfficeHours.day09.addressTask;

public class AddressObject {

    public static void main(String[] args) {

        Address home = new Address();
        home.setStreet("16702 Main Street, Suite 756");
        home.setCity("Chicago");
        home.setState("IL");
        home.setZipCode("57896");

        System.out.println("Home address: " + home);
        // Home address: Address{ street='16702 Main Street, Suite 756', city='Chicago', state='IL', zipCode='57896', country='USA'}

        home.setZipCode("578962"); // Error: Invalid ZipCode
        home.setStreet(""); // Error: Invalid Street
        System.out.println("Home address: " + home);
        // Home address: Address{ street='16702 Main Street, Suite 756', city='Chicago', state='IL', zipCode='57896', country='USA'}

        Address work = new Address("16702 Main Street, Suite 756", "Chicago","IL","57896");
        System.out.println("Work address: " + home);
        // Work address: Address{ street='16702 Main Street, Suite 756', city='Chicago', state='IL', zipCode='57896', country='USA'}

    }
}
