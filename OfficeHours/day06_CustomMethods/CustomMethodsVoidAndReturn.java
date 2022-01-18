package OfficeHours.day06_CustomMethods;

public class CustomMethodsVoidAndReturn {

    public static void main(String[] args) {

        sum(5,4);
        System.out.println(sum1(5, 4)); // 9

    }

    // VOID METHOD
    public static void sum(int a, int b){

        System.out.println(a + b); // 9
    }

    // RETURN METHOD
    public static int sum1(int a, int b){

        return a + b;
    }


}
