package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Akiko","Shiba Inu",'M',2,"Small", "White and Amber");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        System.out.println(dog);

        // Dog does not share any methods from Cat and vice versa

        Cat cat = new Cat();
        cat.setInfo("Arthur","Russian Blue",'F', 3,"Small","Silver");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.meow();

        System.out.println(cat);

        Lion lion = new Lion();
        lion.setInfo("Simba","African",'M',1,"Large","Amber");

        lion.eat();
        lion.drink();
        lion.sleep();
        lion.move();
        lion.roar();

        System.out.println(lion);

    }
}
