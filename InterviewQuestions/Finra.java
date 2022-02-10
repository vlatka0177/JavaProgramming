package InterviewQuestions;

public class Finra {

        /*
        Write a method that prints out numbers from 1 to 30, but
        for numbers that are a multiple of 3 print "FIN" instead of the number,
        for numbers that are a multiple of 5 print "RA" instead of a number,
        for numbers that are a multiple of 3 and 5 print "FINRA" instead of the number.
        */

        public static String Finra(int num){ // allows us to reuse the method

            String result = "";

            for (int i = 1; i <= num; i++) {

                if (i % 15 == 0) {
                    result += "FINRA ";
                } else if (i % 3 == 0) {
                    result += "FIN ";
                } else if (i % 5 == 0) {
                    result += "RA ";
                } else {
                    result += i + " ";
                }
            }
            return result;
            }

    public static void main(String[] args) {
            String Finra = Finra(30);
        System.out.println("FINRA = " + Finra);
    }
        }


