package AvengersPractice.day06;

public class Question1 {

        String name;
        int numOfTests;

        public void setInfo (String name, int numOfTests) { //  add
            this.name = name;
            this.numOfTests = numOfTests;
        }

    public String toString() { // add
        return "{" +
                "name='" + name + '\'' +
                ", numOfTests=" + numOfTests +
                '}';
    }

    public static void main(String[] args) {
            Question1 t = new Question1();

            t.setInfo("smoke test", 15);

            // I want to get this output {name='smoke test', numOfTests=15}

            System.out.println("t = " + t); // t = {name='smoke test', numOfTests=15}
        }
    }

