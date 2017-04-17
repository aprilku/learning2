package ru.loginov.learning.sort;

public class Swap {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        // a ^ a = 0
        // a ^ 0 = a
        a ^= b; //a == 5^10
        b ^= a; //b == 10^5^10 = 5^0 = 5
        a ^= b; //5^10^5 = 10^0 = 10

        System.out.println(a);
        System.out.println(b);
    }

}
