package it.develhope.JavaAdvancedOOP.exercise_2.p1;

public class Circle extends Shape {

    public Circle(double height, double width) {
        super(height, width);
        setWidth(width = height);
    }
}
