package Assessments.Assessment2_day04OfficeHours;

public class Q29 {

    public static void main(String[] args) {

        // Index  0, 1, 2, 3, 4, 5
        int [] nms = {14,1,84,97,1243,46};
        int ttl = 0;

        for(int i = 0; i < nms.length; i++) {  // i = 0

            if(nms[i] % 2 != 0) {
                ttl += 3; // If not divisible by 2, add 3
            }else {
                ttl += 10; // If not, add 10. 14 % 2 = 0, index 0, so 10.
            }
            if(i % 3 == 0) {  // Not nms, but i. 0 % 3 == 0, so -15
                ttl -= 15;
            }
        }
        System.out.println(ttl);  // 9
    }
}
