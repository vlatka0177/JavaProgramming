package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        /*
        4. Write a program that can return the frequency of the word Java from the sentence
           Ex:
           Input: sentence = "JavaJavaJava";
           Output:3

           Hint: you need to create

           str = "JavaJava";

           substrings:
            1. Java // substring (0, 4)
            2. avaJ // substring (1, 5)
            3. vaJa // substring (2, 2+4)
            4. aJav // substring (3, 3+4)
            5. Java // substring (4, 4+4)                                        */

        String str = "JavaJavaJavaJavaJava";

        int frequency = 0;

                     // i < str.length() - 3
        for (int i = 0; i <= str.length() - 4; i++) {

            String EachSub = str.substring(i, i + 4);
            // System.out.println(EachSub);

            if (EachSub.equals("Java")) {
                frequency++;
            }
        }
        System.out.println(frequency); // 5

        }
    }