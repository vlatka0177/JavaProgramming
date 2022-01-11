package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] names = {"Vlatka Persin", "Ivan Ludlow", "Helena Hrebinec", "Tomislav Vukusic", "Marko Ludlow",
                "Michael Petro", "Matilda Vukusic", "Sebastian Ludlow", "Ana Aleksov", "Valerija Hrebinec"};

        for (String each : names) {
            String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ")+1) + ".";

            System.out.println(initial); // V.P. I.L. H.H. T.V. M.L. M.P. M.V. S.L. A.A. V.H.

        }

    }

}
