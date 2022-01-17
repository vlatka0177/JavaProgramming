package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Dalmatian", 'M', 4,"Small", "White and Black");
        System.out.println(dog1);

        Cat cat1 = new Cat("Love", "Siamese", 'F', 3,"Small","Tan");
        System.out.println(cat1);

        Parrot parrot1 = new Parrot("King", "Macaw",'M', 3,"Small","Green");
        System.out.println(parrot1);
    }
}
