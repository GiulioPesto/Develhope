package it.develhope.JavaOOP.exercise_3;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int id;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Invalid name");
        } else {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null) {
            System.out.println("Invalid surname");
        } else {
            this.surname = surname;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("You are not a person");
        } else {
            this.age = age;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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
