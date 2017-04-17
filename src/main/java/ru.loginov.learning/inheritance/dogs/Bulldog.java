package ru.loginov.learning.inheritance.dogs;

public class Bulldog extends Dog {

    final String name = "bullDoggg";

    int age;

    public Bulldog(String name) {
        super(name);
    }

    void fight() {
        System.out.println(super.name + " " + name + " fights!");
    }

    @Override
    public String toString() {
        return "I'm a bulldog named " + super.name;
    }
}
