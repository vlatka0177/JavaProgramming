package AvengersPractice.day04;

public class FrequencyOfBaseInDNA {

    /*
    Find frequency of bases 'A','C','G','T' in A DNA string.
    DNA string = "ATGCTTCAGAAAGGTCTTACG"
    Expected output: A:6 C:4 G:5 T:6                                          */

    public static void main(String[] args) {

        String dna = "ATGCTTCAGAAAGGTCTTACG";
        String result = findFrequencyOfBaseInDNA(dna);
        System.out.println("result = " + result); // result = A: 6 C: 4 G: 5 T: 6
    }

    private static String findFrequencyOfBaseInDNA(String dna) {
        int a = findFrequencyOfLetter(dna, 'A');
        int c = findFrequencyOfLetter(dna, 'C');
        int g = findFrequencyOfLetter(dna, 'G');
        int t = findFrequencyOfLetter(dna, 'T');

        return "A: " + a + " C: " + c + " G: " + g + " T: " + t;
    }

    private static int findFrequencyOfLetter(String dna, char ch) {
        int counter = 0;
        char[] chars = dna.toCharArray();
        for (char each : chars) {
            if (each == ch) {
                counter++;
            }
        }
        return counter;
    }
}