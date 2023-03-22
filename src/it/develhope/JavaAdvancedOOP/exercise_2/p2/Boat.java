package it.develhope.JavaAdvancedOOP.exercise_2.p2;

public class Boat implements Movable{
    @Override
    public void moveForward(int distance) {
        System.out.println("The distance in forward for the boat is: " + distance + " meters");
    }

    @Override
    public void moveBackward(int distance) {
        System.out.println("The distance in backward for the boat is: " + distance + " meters");
    }
}
