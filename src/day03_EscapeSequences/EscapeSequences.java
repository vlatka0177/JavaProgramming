package day03_EscapeSequences;

public class EscapeSequences {

    public static void main(String[] args) {

        /*
        Escape sequences MUST be followed by double quote
        \n: New line
        \t: Tab indent
        \\ Backslash (Causes A backslash \ to be printed.)
        \" Inverted comma (Causes an inverted comma " to be printed.)
        */

        System.out.println("Java \nPython \nC#");

        System.out.println("--------------");

        System.out.println("Hello Cydeo! \nHow are you all today? \nIt's nice to see you all. \nWhat class do we have next week?");

        System.out.println("---------------");

        System.out.println("\tJava is A cool programming language.");

        System.out.println("/ \\"); // To print one backslash, \\ needs to be used.

        System.out.println("-----------------");

        System.out.println("My favorite TV show is \"Game of Thrones\""); // To print double quote, \" needs to be used.

    }
}
