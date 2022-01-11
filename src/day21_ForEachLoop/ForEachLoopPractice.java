package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String each : words) { // each represents each element in the loop.

            System.out.println(each.charAt(0) + "" + each.charAt(each.length()-1)); // Jg Cl Wn Es As
        }

    }
}
