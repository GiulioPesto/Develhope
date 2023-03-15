package it.develhope.JavaAdvanced.exercise_6;

public enum Operator {
    ADD(0,0), SUBTRACT(0,0), MULTIPLY(0,0), DIVIDE(0,0);

    private double n1;
    private double n2;
    private double result;

    Operator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getOperation(double n1, double n2) {
        switch (this) {
            case ADD -> result = n1 + n2;
            case SUBTRACT -> result = n1 - n2;
            case MULTIPLY -> result = n1 * n2;
            case DIVIDE -> result = n1 / n2;
        }
        return result;
    }
}
