package OfficeHours.day07.constructor;

public class BaklavaRecipe {

    public String type;
    public int amountLB;
    public double price;

    public BaklavaRecipe(String type) {

        this.type = type;
    }

    public BaklavaRecipe(String type, int amountLB) {
        this(type);
        this.amountLB = amountLB;
    }

    public BaklavaRecipe(String type, int amountLB, double price) {
        this(type, amountLB);
        this.price = price;
    }

    public void feedback() {

        System.out.println("Please write A feedback for our desserts.");
    }

    public static void order() {

        System.out.println("Please give your order at least three days in advance.");
    }

        public String toString() {
            return "BaklavaRecipe{" +
                    "type='" + type + '\'' +
                    ", amountLB=" + amountLB +
                    ", price=" + price +
                    '}';
        }
}
