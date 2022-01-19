package OfficeHours.day08;

public class SDET {

    public SDET(){
        System.out.print(1); // 1 3 7 1 1 3
        /* sout (1) = 1
           sout(3) = 3
           sout(7)
         */
    }

    public SDET(int number){
        this();  // first print out what is inside this constructor. Empty goes to sout(1)
        System.out.print(3);
    }

    public SDET(String name){
        this(name.length()); // this(5) length of Anita
        System.out.print(7);
    }
}
class Team {

    public static void main(String[] args) {
        new SDET("Anita"); //
        new SDET(); // 1 (no arguments)
        new SDET(4); // 1 3
    }
}
