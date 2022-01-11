package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] names = {"Vlatka Persin", "Ivan Ludlow", "Helena Hrebinec", "Tomislav Vukusic", "Marko Ludlow",
                "Michael Petro", "Matilda Vukusic", "Sebastian Ludlow", "Ana Aleksov", "Valerija Hrebinec"};

        for (String each : names) { // each: "Vlatka Persin", "Ivan Ludlow", ...
                                    // Each element that the inner loop needs to reverse
            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) { // reverses the string
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
            /* nisreP aktalV wolduL navI ceniberH aneleH cisukuV valsimoT wolduL okraM orteP leahciM cisukuV adlitaM
               wolduL naitsabeS voskelA anA */
        }
    }
}
