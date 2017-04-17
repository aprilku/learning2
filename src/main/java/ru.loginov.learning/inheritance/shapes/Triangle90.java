package ru.loginov.learning.inheritance.shapes;

public class Triangle90 extends Shape {

    static void printPifagor() {
        System.out.println("a square + b square = c square");
    }

    final int a;
    final int b;

    public Triangle90(int a, int b) {
        this.a = a;
        this.b = b;
    }

    double getSquare() {
        return a * b / 2.0;
    }

    void print() {
        System.out.println("I'm a triangle with a =" + a + " and b = " + b);
    }

}
