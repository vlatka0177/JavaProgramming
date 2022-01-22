package AvengersPractice.day02;

public class StringWithoutGivenIndex {

    public static void main(String[] args) {

        /*
        Given A non-empty string and an int n, return A new string where the char at index n has been removed.
        The value of n will be A valid index of A char in the original string

        Input:  kitchen and 2       Output: kichen
        Input:  kitchen and 0       Output: itchen
        */



        String word = "kitchen";
        int index = 0;

        String result = word.substring(index+1);
        System.out.println("result = " + result);

        String result2 = "";
        for(int i = 1; i < word.length(); i++) {
            result2 += word.charAt(i);
        }
        System.out.println("result2 = " + result2);




    }
}
