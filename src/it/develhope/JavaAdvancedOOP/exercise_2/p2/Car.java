package it.develhope.JavaAdvancedOOP.exercise_2.p2;

public class Car implements Movable{

    @Override
    public void moveForward(int distance) {
        System.out.println("The distance in forward for the car is: " + distance + " meters");
    }

    @Override
    public void moveBackward(int distance) {
        System.out.println("The distance in backward for the car is: " + distance + " meters");
    }
}
