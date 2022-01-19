package Assessments.Assessment3;

public class Q12 {

    public static void main(String[] args) {

        System.out.println(method6("mark")); // [I@3f0ee7cb (hashcode)
                                                 // toString is missing to print
    }

    public static int[] method6(String str) {

        int[] arr = new int[str.length()];
        int n = 10;

        for (int i = 0; i < arr.length; i++) {
            if (n == 20 || n == 50 || n == 70) {
                continue;
            }
            arr[i] = n;
            n *= 10;
        }
        return arr;
    }
}
