package OfficeHours.day07.statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {

    public static int num;
    public static ArrayList<String> carModels;

    static {

        num = 10;
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("Toyota", "BMW", "Ford", "Honda"));
    }

    public StaticBlock() {
        System.out.println("no arg");
        num += 5;
    }

    public StaticBlock(int value) {

        System.out.println("One parameter constructor");
        num += value;
    }
}
