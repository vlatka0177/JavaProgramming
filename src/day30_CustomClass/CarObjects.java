package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Volkswagen", "GLI", "White", 2008, 1000);

        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Audi", "RS e-tron GT", "Red", 2022, 145000);

        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Tesla", "Model 3", "Red", 2022, 45000);

        System.out.println(car3);

        // Car[] cars = {car1, car2, car3};

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));

        for (Car each : carsList) {
            System.out.println(each.brand + ": " + each.price);
        }

        System.out.println("----------------------------------------------------------------------------------");

        // Recall Volkswagen 2005 ~ 2008 and Tesla 2019 ~ 2020

        carsList.removeIf(p -> p.brand.equals("Volkswagen") && p.year >= 2005 && p.year <= 2008);
        carsList.removeIf(p -> p.brand.equals("Tesla") && p.year >= 2019 && p.year <= 2020);
    }
}
