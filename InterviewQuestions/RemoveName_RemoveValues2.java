package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveName_RemoveValues2 {

    public static void main(String[] args) {

        List<Object> newArr = new ArrayList<>(Arrays.asList(130, "Adam", 95, "Martin", 125, "John", 50));
        System.out.println(remove_some_digits_and_words(newArr));
    }

    public static Object remove_some_digits_and_words(List<Object> mix) {

        for (Iterator<Object> iter = mix.iterator(); iter.hasNext(); ) {

            String current = iter.next().toString();

            if (Character.isDigit(current.charAt(0))) {
                int num = Integer.parseInt(current);
                if (num > 100) iter.remove();
            } else {
                if (current.equals("Adam")) {
                    iter.remove();
                }
            }
        }

        return mix;
    }
}
