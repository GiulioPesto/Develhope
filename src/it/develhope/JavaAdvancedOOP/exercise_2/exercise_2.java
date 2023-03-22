package it.develhope.JavaAdvancedOOP.exercise_2;

import it.develhope.JavaAdvancedOOP.exercise_2.p1.Circle;
import it.develhope.JavaAdvancedOOP.exercise_2.p1.Rectangle;
import it.develhope.JavaAdvancedOOP.exercise_2.p2.Boat;
import it.develhope.JavaAdvancedOOP.exercise_2.p2.Car;
import it.develhope.JavaAdvancedOOP.exercise_2.p2.Movable;
import it.develhope.JavaAdvancedOOP.exercise_2.p3.Guitar;
import it.develhope.JavaAdvancedOOP.exercise_2.p3.Instrument;
import it.develhope.JavaAdvancedOOP.exercise_2.p3.Piano;

public class exercise_2 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     * Create an abstract class called "Shape" with fields of height and width
     *
     * Create classes called "Rectangle" and "Circle" that extend the GeometricShape class and implement the calculateArea() method.
     *
     * Create instances of both and calculate their area
     *
     * To calculate the area copy the following code:  Math.PI * Math.pow((height / 2), 2)
     *
     *
     * BONUS: Make sure the height and width values are exactly the same for Circle, change the constructor to do this
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Rectangle rect = new Rectangle(10, 5);
        Circle circle = new Circle(35, 40);
        System.out.println(circle.getWidth());
        System.out.println(circle.getHeight());
        System.out.println(rect.calculateArea());
        System.out.println(circle.calculateArea());
    }

    /**
     * 2:
     *
     *
     * Create an interface class called "Movable" that has the following methods: moveForward, moveBackward
     *
     * Create classes called "Car" and "Boat" that implement the Movable Interface
     *
     * Write code below that creates instances of both the Car and Boat class and demonstrates the use of the methods from the Movable interface.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Movable car = new Car();
        car.moveForward(20);
        car.moveBackward(6);

        Movable boat = new Boat();
        boat.moveForward(30);
        boat.moveBackward(4);
    }

    /**
     * 3:
     *
     *
     * Create an interface called "Playable" with an abstract method called "play()".
     *
     * Create an abstract class called "Instrument" that implements the Playable interface and contains the fields "name" and "brand".
     *
     * Create classes called "Guitar" and "Piano" that extend the Instrument class and implement the play() method.
     *
     * Write code below that creates instances of both the Guitar and Piano class and demonstrates the use of the play() method.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Instrument guitar = new Guitar("Black Guit", "Yamaha");
        Instrument piano = new Piano("Crystal", "Heintzman");
        System.out.println(guitar.play());
        System.out.println(piano.play());
    }
}
