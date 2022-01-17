package day39_Recap.animalTask;

public class FriendlyAnimal extends Animal {

    /*
    2. Create a subclass of Animal named FriendlyAnimal:
       Variable:
                isWild
                isFriendly
                isPlayable

       Extra methods:
                play()
                pet()
        */

    private static boolean isWild = false,
                           isFriendly = true,
                           isPlayable = true;

    // Encapsulate additional fields through getters and setters
    public static boolean isIsWild() {
        return isWild;
    }

    public static void setIsWild(boolean isWild) {
        FriendlyAnimal.isWild = isWild;
    }

    public static boolean isIsFriendly() {
        return isFriendly;
    }

    public static void setIsFriendly(boolean isFriendly) {
        FriendlyAnimal.isFriendly = isFriendly;
    }

    public static boolean isIsPlayable() {
        return isPlayable;
    }

    public static void setIsPlayable(boolean isPlayable) {
        FriendlyAnimal.isPlayable = isPlayable;
    }

    // Add a constructor to set all the fields.
    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    // Add additional methods
    public void play() {

        System.out.println(getName() + " is playing.");
    }

    public void pet() {

        System.out.println(getName() + " can be petted.");
    }

    // Generate toString
    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + getName() + '\'' +  // Copy name, breed, gender, age, size, color from parent. Add getter.
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
