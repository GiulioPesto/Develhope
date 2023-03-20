package it.develhope.JavaAdvancedOOP.exercise_1;

public class exercise_1 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog labrador = new Dog(0.60, 36, "Labrador");
        System.out.println(labrador.getBreed());
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish salmon = new Fish(0.20, 10, "Salmon");
        Bird parrot = new Bird(0.35, 0.400, 0.40);
        System.out.println(salmon.getSpecies());
    }


    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog labrador = new Dog(0.60, 36, "Labrador");
        Fish salmon = new Fish(0.20, 10, "Salmon");
        Bird parrot = new Bird(0.35, 0.400, 40);

        System.out.println("The dog's speed is " + labrador.runSpeedMetersPerSecond() + " meters per second");
        System.out.println("The fish's speed is " + salmon.swimSpeedMetersPerSecond() + " meters per second");
        System.out.println("The bird's speed is " + parrot.flySpeedMetersPerSecond() + " meters per second");

        if (labrador.runSpeedMetersPerSecond() > salmon.swimSpeedMetersPerSecond() &&
                labrador.runSpeedMetersPerSecond() > parrot.flySpeedMetersPerSecond()) {
            System.out.println("The dog is the fastest animal");
        } else if (salmon.swimSpeedMetersPerSecond() > labrador.runSpeedMetersPerSecond() &&
                salmon.swimSpeedMetersPerSecond() > parrot.flySpeedMetersPerSecond()) {
            System.out.println("The fish is the fastest animal");
        } else {
            System.out.println("The bird is the fastest animal");
        }
    }
}