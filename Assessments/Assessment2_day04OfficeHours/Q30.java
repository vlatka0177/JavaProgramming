package Assessments.Assessment2_day04OfficeHours;

public class Q30 {

    public static void main(String[] args) {
        // QUESTION 30

        String [] things = {"house", "shed", "slide", "zebra", "park", "garden"};

        for(String st: things) {
            switch(st.charAt(1)) {
                case 'h':
                    System.out.print(1);
                    break;
                case 'a':
                    System.out.print(2);
                case 's':
                    System.out.print(3);
                    break;
                case 'o':
                default:
                    System.out.print(4);
                case 'p':
                    System.out.print(5);
                    break;
                case 'z':
                    System.out.print(6);
                case 'l':
                    break;
                case 'g':
                    System.out.print(7); // 451452323
            }
        }

    }
}



