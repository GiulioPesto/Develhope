package it.develhope.JavaAdvancedOOP.exercise_2.p3;

public class Guitar extends Instrument{

    public Guitar(String name, String brand) {
        super(name, brand);
    }
    @Override
    public String play() {
        return "Im playing a " + getName() + " made by " + getBrand();
    }
}