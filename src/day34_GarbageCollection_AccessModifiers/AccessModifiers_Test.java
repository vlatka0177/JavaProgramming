package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiersIntro.publicData); // 100 Always accessible

        System.out.println(AccessModifiersIntro.defaultData); // 200 Accessible within the same class and package
        /*
        System.out.println(AccessModifiersIntro.privateData); // private access in day34_GarbageCollection_
                                                                 AccessModifiers.AccessModifiersIntro
                                                                 Not visible outside the same class         */

    }
}
