package AvengersPractice.day06.Question19;

public class Box {

    double width;
    double length;

    public String print() {
   // public String toString() {
        return "Width: " + width + ", Length: " + length;
    }

    public void setInfo(double width, double length) {
            this.width = width;
            this.length = length;

    }
}
