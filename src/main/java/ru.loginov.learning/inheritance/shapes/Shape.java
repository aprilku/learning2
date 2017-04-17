package ru.loginov.learning.inheritance.shapes;

public abstract class Shape {

    static void printPifagor() {
        System.out.println("a*a + b*b = c*c");
    }

    static void printAbc() {
        System.out.println("abc");
    }

    abstract double getSquare();

}
