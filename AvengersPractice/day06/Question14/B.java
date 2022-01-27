package AvengersPractice.day06.Question14;

public class B extends A {

    //@Override
    public void method (int a) {
    method(); // A with non parameter, followed by B with parameter
        System.out.println("B with parameter");
    }

    public static void main(String[] args) {

        B obj = new B() ;
      //  obj.method(); // only A with non parameter is printed
        obj.method(5); // only B with parameter is printed


    }
}
