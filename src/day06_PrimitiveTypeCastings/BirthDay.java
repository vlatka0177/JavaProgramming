package day06_PrimitiveTypeCastings;

public class BirthDay {

    public static void main(String[] args) {

        String name = "Vlatka";
        int birthDay = 6;
        String birthMonth = "January";
        int birthYear = 1965;

        System.out.println(name + " was born on the " + birthDay + " " +birthMonth + " " + birthYear + ".");

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear + ".");

        System.out.println("\n");
//My favorite book is "bookName".
        String bookName = "My favorite book is \"The Prophet\"";
        System.out.println(bookName);

        String bandName = "My favorite band is 'Foo Fighters'.";
        System.out.println(bandName);

    }
}
