package AvengersPractice.day06.Question11;

public class TestPage extends HomePage {

    public TestPage() {

        System.out.println("I am in Test Page");
    }

    public static void main(String[] args) {

        HomePage homePage = new HomePage(); /* I am in Base Page
                                               I am in Home Page    */

    }
}

