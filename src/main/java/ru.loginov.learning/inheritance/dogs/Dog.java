package ru.loginov.learning.inheritance.dogs;

public class Dog {
    final String name;

    public Dog(String name) {
        this.name = name;
    }

    void woof() {
        System.out.println(name + " woofs!");
    }

}
