package day04_Variables;

public class Currency {

    public static void main(String[] args) {

        int dollar = 1000;

        double turkishLira = dollar * 9.52;
        double euro = dollar * 0.86;
        double japaneseYen = dollar * 114;
        double poundSterling = dollar * 0.73;
        double canadianDollar = dollar * 1.24;

        System.out.println("lira = " + turkishLira);
        System.out.println("euro = " + euro);
        System.out.println("japaneseYen = " + japaneseYen);
        System.out.println("poundSterling = " + poundSterling);
        System.out.println("canadianDollar = " + canadianDollar);

    }
}
