package ru.loginov.learning.inheritance.shapes;

public class Main {

    public static void main(String[] args) {
        int i = 5;
        long l = Integer.MAX_VALUE + 10;
        i = (int) l;
        System.out.println(i);
        long l2 = 500L;
        byte b = 5;
        int i2 = b;
        //byte -> 1
        //char -> 2
        //int  -> 4
        //long -> 8

        float f = 5.0f;
        double d = 50.0;
        d = f;
        f = (float) d;
        //float  -> 4
        //double -> 8

        d = l;
        l = (long) d;

        m1(i);
        m1(l);
        m1(f);
    }

    static void m1(long l) {
        System.out.println("m1 for longs");
    }

    static void m1(int i) {
        System.out.println("m1 for ints");
    }

    static void m1(float f) {
        System.out.println("m1 for floats");
    }

    public static void main1(String[] args) {
        Triangle90 t = new Triangle90(1, 1);
        Triangle90.printPifagor();
//        Shape.printPifagor();
//        Shape.printAbc();


        Shape triangle = null; //new Triangle90(5, 10);
        triangle.printPifagor();
//        triangle.getSquare();
        Shape rectangle = new Rectangle(1, 2);
        Shape square = new Square(5);
        square.getSquare();
    }

}
