package it.develhope.Java_In_Production.exercise_2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class exercise_2 {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private static List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();
    /**
     * 1:
     *
     *
     * Use filter to select only even numbers from the list 'ourNumbers'
     *
     * Use forEach to print the selected even numbers
     *
     * %
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        ourNumbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
    }

    /**
     * 2:
     *
     *
     * Use filter to select only odd numbers from the list 'ourNumbers'
     *
     * Use the toSet() method to collect the selected odd numbers in a Set
     *
     * Print the resulting Set
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        ourNumbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toSet()).forEach(System.out::println);
    }


    /**
     * 3:
     *
     *
     * Use map to convert the strings to uppercase
     *
     * Use the toSet() method to collect the resulting uppercase strings in a Set
     *
     * Print the resulting Set
     *
     * BONUS: do so without creating any variables!
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        List<String> alice = List.of("Alice", "Bob", "Charlie");
        // Your code here
        alice.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
    }

    /**
     * 4:
     *
     *
     * Use filter to select only even numbers from the list 'ourNumbers'
     *
     * Use map to multiply the even numbers by 2
     *
     * Use the toSet() method to collect the resulting numbers in a Set
     *
     * Print the resulting Set
     */
    private static void exercise4() {
        System.out.println("\nExercise 4");
        //Your code here
        ourNumbers.stream().filter(num -> num % 2 == 0).map(num -> num * 2).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
