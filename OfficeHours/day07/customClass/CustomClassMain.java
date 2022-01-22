package OfficeHours.day07.customClass;

public class CustomClassMain {

    public static void main(String[] args) {

        /*
        OBJECT
            - An instance of A class
            - Has its own memory
            - Cannot create an OBJECT without A class

            Car             c               =               new                              Car();
           Class          Object                    Keyword to create an object           Constructor
         */


        // Create an Object CustomClass
        CustomClassIntro c = new CustomClassIntro();
        System.out.println("c = " + c);

        System.out.println("================");

        // Call Instance Variable
        c.instanceVariable = "Instance Variable From Main Class";
        System.out.println("c = " + c);

        System.out.println("================");

        // Call setInfo
        c.setInfo("Instance Variable From SetInfo");
        System.out.println("c = " + c);

        System.out.println("================");

        // Call Static Variable
        CustomClassIntro.staticVariable = "Static Variable From Main Class via ClassName";
        //c.staticVariable = "Static Variable From Main Class via Object";
        System.out.println("c = " + c);

        System.out.println("================");

        // Call Static Method
        CustomClassIntro.staticMethod();
        System.out.println("c = " + c);

        System.out.println("================");

        // Call Instance Method
        c.instanceMethod();
        System.out.println("c = " + c);

        System.out.println("================");

        // Create A new Object
        CustomClassIntro c1 = new CustomClassIntro();
        System.out.println("c = " + c1);

        System.out.println("================");

        // Create A new Object
        CustomClassIntro c2 = new CustomClassIntro();
        System.out.println("c = " + c2);

        System.out.println("================");

        CustomClassIntro.staticVariable = "Last value from Main Class";
        System.out.println("c = " + c);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

    }
}


