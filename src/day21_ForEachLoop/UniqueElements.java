package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Linda", "Linda", "Alex", "Olga", "Adam", "Adam", "Adam", "Cindy", "Cindy", "Martin"};

        for (String each : words) {
            // each: "Linda", "Linda", "Alex", "Olga", "Adam", "Adam", "Adam", "Cindy", "Cindy", "Martin"

            int count = 0;

            for (String element : words) {
                // element: "Linda", "Linda", "Alex", "Olga", "Adam", "Adam", "Adam", "Cindy", "Cindy", "Martin"

                if(element.equals(each)){ // Each element is compared to the other
                    count++; // After comparison of elements, the count is increased by one
                }
            }
            if(count == 1){
                System.out.println(each); // Alex Olga Martin

            }
        }
    }
}
