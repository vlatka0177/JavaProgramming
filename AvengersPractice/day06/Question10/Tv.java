package AvengersPractice.day06.Question10;

public class Tv {

        private void init() {
            System.out.println("Initialized"); // Prints first
        }

        public void start() { // void start() {} is default
            init(); // line 2
            System.out.println("Started"); // Prints second
        }
    }
