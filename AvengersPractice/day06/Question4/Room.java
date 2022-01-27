package AvengersPractice.day06.Question4;

public class Room {

    double width;
    double length;

    public String toString() { // Blue circle = Overriden Method in Object Class

        return "Width: " + width + ", Length: " + length;
    }

    public void setInfo(double width, double length) {
        this.width = width;
        this.length = length;
    }
}
