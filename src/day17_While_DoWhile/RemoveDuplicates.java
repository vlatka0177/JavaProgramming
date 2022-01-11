package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCC";
        String result = ""; // A

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); // "A", "A", "B", "B", "C", "C"
            if(result.contains("" + ch)){ // If the result already contains the character
                continue; // Skip
            }
            result += ch;
        }
        System.out.println(result); // ABC
    }
}
