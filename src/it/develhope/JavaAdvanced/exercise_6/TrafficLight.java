package it.develhope.JavaAdvanced.exercise_6;

public enum TrafficLight {
    RED, YELLOW, GREEN;

    public TrafficLight next() {
        return this.equals(RED)? GREEN : this.equals(GREEN)? YELLOW : this.equals(YELLOW)? RED : null;
    }
}
