package day23_CustomMethod_Void;

public class CustomMethodIntro {

    public static void main(String[] args) {

       /*
        Method
        - groups A series of code fragments to perform A function
        - allows us to reuse the function rather than repeat the same set of statements

        Declaring A Method

         public     static    void    main(String[] args){
        }  |          |        |         |         |
           |          |        |         |         |
        Access     Static   Return    Method   Parenthesis
        Modifier   Modifier   Type      Name
           |          |        |         |         |
        public     static    void    displayMessage(){

        System.out.println("Hello World!");
        System.out.println("I love Java");
        }

        Each method has to be independent (not within another method).
        The order in which methods are declared is not relevant.

        Access Modifier
        - determines the visibility
        - public, protected, default, private
        - public is open to the world and is always accessible

        Static Modifier
        - allows us to call the method through the class name
        - static, final, abstract, synchronized

        Return Type:
        - determines if the method returns A value
        - void, Any Data Type
        - if return type is void, method does not return any value

        Method Name
        - descriptive name of the function (any name that is meaningful)
        - the same rules that apply to variable names also apply to method names

        Parenthesis
        - method name is always followed by A set of parenthesis
        - can be capable of receiving arguments.

        Parameter
        - entered when the method demands additional information to complete its task.

        Calling A Method
        - when we need to perform the task declared in the method body, we call the method.

        displayMessage();    // Calls A method.
                                Method has to be called within main method to see the output in the console.
                                All the code fragments grouped under the method get executed from top to bottom.

        System.out.println("Wooden Spoon");  // Executed after the last statement of the called method. "I love Java."

        public static void displayMessage(){
        System.out.println("Hello World!");
        System.out.println("I love Java");
        }

        Custom Methods
        - void methods
        - void methods with arguments
        - return method
        - return method with arguments
        - overloading

        Passing Argument to Method
        - When we declare A method, parameters can be given
        - Parameters passed to the method act like variables
        - Used for providing additional information the method must have to perform its task

                                        Parameter
                                           |
        public static void displayValue(int num){
        System.out.println("The value is " + num);

        Calling Method that Needs Specific Information
        - must specify the values the method should use
        - values need to be given in the parenthesis that follows method name
        - the values we passed to the method are called arguments
        - arguments can be provided as values or as variables

                                                Argument
                                                  |
                                                  V
                                     displayValue(5);
                                            |      The argument 5 is copied
                                            |      into the parameter
                                            V      variable num
        public static void displayValue(int num){
        System.out.println("The value is " + num);
        */

    }

}
