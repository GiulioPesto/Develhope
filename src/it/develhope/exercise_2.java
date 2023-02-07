package it.develhope;

public class exercise_2 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        System.out.print('G');
        System.out.println('P');
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        System.out.println(18);
        System.out.println(true);
        System.out.println(7.80);
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        int myAge = 18;
        System.out.println("My age is: ");
        System.out.println(myAge);
        boolean hasIHadLaunch = true;
        System.out.println("Had launch today: ");
        System.out.println(hasIHadLaunch);
        double launchPrice = 7.8;
        System.out.println("The price of the launch was: ");
        System.out.println(launchPrice);
    }
}
