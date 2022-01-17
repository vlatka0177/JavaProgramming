package OfficeHours.day02_IfStatementSwitchForLoopScanner;

public class SwitchEx {

    public static void main(String[] args) {

        /*  Switch: integer, byte, char and string

        Create  a program that accepts animal as String

           DOG     - domestic animal
           CAT     - domestic animal
           TIGER   - wild  animal

           For other animal - unknown animal

           INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal */

        String animal = "CAT";
        String result = " ";

        switch(animal){
            case "DOG":
            case "CAT":
                result = "domestic animal";
                break;
            case "TIGER":
                result = "wild animal";
                break;
            default:
                result ="unknown animal";
        }

        System.out.println("Animal: " + result);


    }

}
