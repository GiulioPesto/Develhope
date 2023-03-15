package it.develhope.JavaAdvanced.exercise_6;

public enum Seasons {
    SPRING("March, April, May"), SUMMER("June, July, August"), FALL("September, October, November"), WINTER("December, January, February");
    private String months;
    Seasons(String months) { this.months = months;}
    public String getMonths() { return months; }
}

