package OfficeHours.day07.accessModifier;

import OfficeHours.day06_CustomMethods.WrapperClassIntro;

public class AccessModifier {

    public static void main(String[] args) {

        Person person = new Person();
        person.ID=123;
        person.name="Sebastian";
        person.lastName="Ludlow";
        //person.age=23;

        WrapperClassIntro wp = new WrapperClassIntro();
        System.out.println("wp.str = " + wp.str); // wp.str = anything
    }
}
