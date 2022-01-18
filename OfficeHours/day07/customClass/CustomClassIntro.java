package OfficeHours.day07.customClass;

public class CustomClassIntro {

    public static void main(String[] args) {

        /*
         Class
                - Template/ Blueprint for Object
                - Class can be created without an Object
                            Arrays.toString();
         */
    }

        public String instanceVariable;   // null

     /*
     INSTANCE VARIABLE
                - BELONGS to an OBJECT
                - Created in a class, but outside any method type
                - Attributes of Objects
                - Initialization is not mandatory
                - Accessed via Objects
                        Car c = new Car();
                            c.instanceVariable = "";
                - Can have an access modifier. We are using only public for now.
         */

        public static String staticVariable = "it is initialized when class is loading";

    /*
     STATIC VARIABLE
                   - BELONGS to a CLASS
                   - Refers to the common property of all objects
                   - A single copy of a class' static variable is shared by all objects of the class
                   - Initialization is not mandatory
                   - Accessed via ClassName.staticVariable
                   - if the value of a static variable changes, it affects all Objects
                               Car c = new Car();
                               Car.staticVariable = "BMW";
                               Car c1 = new Car();
                               Car.staticVariable = "Ford";

            */

        public void setInfo(String instanceVariable){
            // To set object attributes
            this.instanceVariable = instanceVariable;
        }

        public void instanceMethod(){
            /*
           Instance Method can access instance variables and methods.
           It can also access static variables and methods.
            */

            System.out.println("Instance method is Running");

            staticVariable = "Static Variable From Instance Method";

            staticMethod();

            instanceVariable = "Instance Variable From Instance Method";

            String localVariable = "Local Variable From Instance Method";

            System.out.println("localVariable = " + localVariable);

            /*
         LOCAL VARIABLE
                        - BELONGS to a METHOD
                        - Defined inside a method
                        - Exists only when related to a method
                        - Can not use access modifier for local variables
             */
        }

        public static void staticMethod() {
            System.out.println("Static Method is running");
            staticVariable = "Static Variable From Static Method";
            //instanceVariable;   Compiler ERROR
            //instanceMethod();
        }

            /*
         STATIC VARIABLE
                - Called via ClassName.staticMethod
                - Can not use instance variable/methods
         */

        public String toString() {
            return "CustomClassIntro{" +
                    "instanceVariable='" + instanceVariable + '\'' +
                    ", staticVariable='" + staticVariable + '\'' +
                    '}';

            // to get info about OBJECT
        }
}
