package day39_Recap.animalTask;

public class WildAnimal extends Animal {

    /*
    3. Create A subclass of Animal named WildAnimal.
       Variable: isWild, isFriendly, isPlayable
       Extra Methods:
       hunt()
    */

    private static boolean isWild = true,
                           isFriendly = false,
                           isPlayable = false;

    public static boolean isIsWild() {
        return isWild;
    }

    public static void setIsWild(boolean isWild) {
        WildAnimal.isWild = isWild;
    }

    public static boolean isIsFriendly() {
        return isFriendly;
    }

    public static void setIsFriendly(boolean isFriendly) {
        WildAnimal.isFriendly = isFriendly;
    }

    public static boolean isIsPlayable() {
        return isPlayable;
    }

    public static void setIsPlayable(boolean isPlayable) {
        WildAnimal.isPlayable = isPlayable;
    }

    // Add A constructor to set all the fields.
    public WildAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    // Add additional method
    public void hunt() {
        System.out.println(getName() + " is hunting.");
    }

    // Generate toString
    @Override
    public String toString() {
        return "WildAnimal{" +
                "name='" + getName() + '\'' +   // Copy name, breed, gender, age, size, color from parent. Add getter.
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
