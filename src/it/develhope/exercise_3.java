package it.develhope;

public class exercise_3 {
    public static void main(String[] args) {

    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int age = 18;
        System.out.println("My age is: " + age);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        int age = 18;
        char initials = 'G';
        System.out.println("My age is: " + age + ", my initial is: " + initials);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        boolean hasEatenLunch = false;
        //Here below there's a primitive double variable that implement inside actual value even decimal numbers
        double lunchCost = 5.99;
        //This is a method of printing that allow you to combine multiple types of primitive variables
        System.out.println("Lunch cost=" + lunchCost);
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
