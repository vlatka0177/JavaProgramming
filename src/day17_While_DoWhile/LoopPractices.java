package day17_While_DoWhile;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.println(i); // 1 2 3 4 5 6 7 8 9 10
        }

        System.out.println("---------------------------------------");

        int j = 1;
        while(j <= 10){
            System.out.println(j);
            j++;
        }

        System.out.println("---------------------------------------");

        int k = 1;
        do {
            System.out.println(k);
            k++;
        }while(k <= 10);

    }
}
