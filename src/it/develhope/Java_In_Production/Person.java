package it.develhope.Java_In_Production;

public record Person(String name, int age, String address) {
    @Override
    public String toString() {
        return "name = " + name + ", age = " + age + ", address = " + address;
    }
}
