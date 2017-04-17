package ru.loginov.learning.inheritance.shapes;

public class Rectangle extends Shape {

    final int a;
    final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }


    double getSquare() {
        return a * b;
    }
}
