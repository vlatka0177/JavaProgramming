package AvengersPractice.day06.Question16;

import java.util.ArrayList;

public class Bed {

    String size;
    ArrayList<Pillow> pillows = new ArrayList<>();

    public Bed (String size, int numOfPillows) {
        this.size = size;
        for(int i = 0; i < numOfPillows; i++) {
            this.pillows.add(new Pillow());
        }
    }
}
