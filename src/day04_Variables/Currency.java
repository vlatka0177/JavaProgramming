package day04_Variables;

public class Currency {

    public static void main(String[] args) {

        int dollar = 1000;

        double turkishLira = dollar * 9.52;
        double euro = dollar * 0.86;
        double japaneseYen = dollar * 114;
        double poundSterling = dollar * 0.73;
        double canadianDollar = dollar * 1.24;

        System.out.println("Turkish lira = " + turkishLira);
        System.out.println("Euro = " + euro);
        System.out.println("Japanese Yen = " + japaneseYen);
        System.out.println("Pound Sterling = " + poundSterling);
        System.out.println("Canadian Dollar = " + canadianDollar);

    }
}
