package it.develhope.JavaAdvanced.exercise_5;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class exercise_5 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     * prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
        try {
            Files.createFile(Path.of("Test.txt"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    /**
     * 2:
     * <p>
     * Write a try-catch block that attempts to open a file
     * <p>
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        String userInputFileName = "test-file.txt";
        // Your code here
        try {
            FileReader reader = new FileReader(userInputFileName);
        } catch (IOException exception) {
            System.out.println("The file could not be found.");
        }

    }

    /**
     * 3:
     * <p>
     * Write a try-catch block that attempts to parse a string as an integer.
     * <p>
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        try {
            Integer.parseInt("house");
        } catch (NumberFormatException e) {
            System.out.println("You have to enter a valid integer");
        }
    }

    /**
     * 4:
     * <p>
     * Write a try block that around this print statement that attempts to divide 2 numbers
     * <p>
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     * <p>
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        int num1 = 10;
        String num2AsString = "0.0";
        try {
            System.out.println(num1 / Integer.parseInt(num2AsString));
        } catch (ArithmeticException e) {
            System.out.println("You have to divide two numbers");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("You have to enter a valid integer");
            e.printStackTrace();
        }
    }
}
