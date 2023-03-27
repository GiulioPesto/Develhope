package it.develhope.Java_In_Production.exercise_1;

public record Person(String name, int age, String address) {
    @Override
    public String toString() {
        return "name = " + name + ", age = " + age + ", address = " + address;
    }
}
