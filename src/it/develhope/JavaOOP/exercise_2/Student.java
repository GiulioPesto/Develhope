package it.develhope.JavaOOP.exercise_2;

public class Student {
    String name;
    Integer age;
    public Student(String name, Integer age) {
        System.out.println("Constructing");
        this.name = name;
        this.age = age;
        System.out.println("Constructed");
    }
    public Student(String name) {
        System.out.println("Constructing2");
        this.name = name;
        System.out.println("Constructed");
    }
    public Student(Integer age) {
        System.out.println("Constructing3");
        this.age = age;
        System.out.println("Constructed");
    }
    public Student() {

    }
}
