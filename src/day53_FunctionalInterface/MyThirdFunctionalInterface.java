package day53_FunctionalInterface;

@FunctionalInterface
public interface MyThirdFunctionalInterface<T> { // T stands for the type

    T method(T data); // an abstract method with a generic name and public access modifier that passes one parameter
}
