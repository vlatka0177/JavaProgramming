package day03_EscapeSequences;

import java.util.Scanner;

public class ReplitPrintVariable7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String topic1 = scan.nextLine();
        String topic2 = scan.nextLine();

        System.out.println("I will learn \"" + topic1 + "\" and \"" + topic2 + "\" at CybertekSchool.");

        scan.close();


    }
}
