package day39_Recap.animalTask;

public class Zoo {

    public static void main(String[] args) {

    /*
    6. Create a class named Zoo.
       Create objects of each subclass and test all the functions of each object.
       Analyze the relationships between the classes.
       (Highlight all classes + Right click + Diagrams + Show diagram pop up
    */

        Cat cat = new Cat("Mitzy","Russian Blue", 'F',4,"small","grey");
        System.out.println("Cat " + cat);
        cat.drink();
        cat.sleep();
        cat.move();
        cat.eat();
        cat.pet();
        cat.play();
        cat.meow();
        cat.scratch();

        System.out.println();

        Dog dog = new Dog("Rex", "German Shepard", 'M', 5,"medium", "grey");
        System.out.println("Dog " + dog);
        dog.drink();
        dog.sleep();
        dog.move();
        dog.eat();
        dog.pet();
        dog.play();
        dog.bark();

        System.out.println();

        Parrot parrot = new Parrot("King", "Macaw",'M', 2,"small", "green");
        System.out.println("Parrot " + parrot);
        parrot.drink();
        parrot.sleep();
        parrot.move();
        parrot.eat();
        parrot.pet();
        parrot.play();
        parrot.fly();

        System.out.println();

        Dolphin dolphin = new Dolphin("Flipper","Delphinus delphis",'M',4,"large","grey");
        System.out.println("Dolphin " + dolphin);
        dolphin.drink();
        dolphin.sleep();
        dolphin.move();
        dolphin.eat();
        dolphin.pet();
        dolphin.play();
        dolphin.swim();

        System.out.println();

        Bear bear = new Bear("Grizzly",'F',6,"large","black");
        System.out.println("Bear " + bear);
        bear.drink();
        bear.sleep();
        bear.move();
        bear.eat();
        bear.hunt();
        bear.hibernate();

        System.out.println();

        Crocodile crocodile = new Crocodile("African", 'F',3,"large","grey");
        System.out.println("Crocodile " + crocodile);
        crocodile.drink();
        crocodile.sleep();
        crocodile.move();
        crocodile.eat();
        crocodile.hunt();
        crocodile.ambush();
        crocodile.grab();

        System.out.println();

        Eagle eagle = new Eagle("Bold", 'M',4,"medium","black and white");
        System.out.println("Eagle " + eagle);
        eagle.drink();
        eagle.sleep();
        eagle.move();
        eagle.eat();
        eagle.hunt();
        eagle.soar();

        System.out.println();

        Lion lion = new Lion("African",'M',6,"large","tan");
        System.out.println("Lion " + lion);
        lion.drink();
        lion.sleep();
        lion.move();
        lion.eat();
        lion.hunt();
        lion.roar();

        System.out.println();

        Python python = new Python("Ball", 'F',28,"large","tan");
        System.out.println("Python " + python);
        python.drink();
        python.sleep();
        python.move();
        python.eat();
        python.hunt();
        python.slither();

        System.out.println();

        Tiger tiger = new Tiger("Sumatran",'M',11,"large","tan and black");
        System.out.println("Tiger " + tiger);
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.eat();
        tiger.hunt();
        tiger.pounce();

    }
}
