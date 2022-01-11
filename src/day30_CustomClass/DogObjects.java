package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {

            Dog dog1  = new Dog();

            dog1.name = "Akiko";
            dog1.breed = "Shiba Inu";
            dog1.age = 6;
            dog1.gender = 'F';
            dog1.size = "Medium";
            dog1.color = "White";

            Dog dog2 = new Dog();

            dog2.name = "Ace";
            dog2.breed = "Husky";
            dog2.age = 5;
            dog2.gender = 'M';
            dog2.size = "Medium";
            dog2.color = "White and Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Rex", "German Shepard", 2, 'M', "Large",
                "Grey");

        Dog dog4 = new Dog();
        dog4.setInfo("Cape", "Rhodesian Ridgeback", 3, 'F', "Large",
                "Brown");

        Dog dog5 = new Dog();
        dog5.setInfo("Dalma", "Dalmatian", 4, 'F',"Medium",
                "White and Black");

            System.out.println(dog1); // Right click. Generate.
            System.out.println(dog2);
            System.out.println(dog3);
            System.out.println(dog4);
            System.out.println(dog5);

            Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        System.out.println(femaleDogs);

        ArrayList<Dog> maleDogs = new ArrayList<>();
        System.out.println(maleDogs);

        }

    }

