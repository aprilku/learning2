package ru.loginov.learning;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialRec(5)); //120
    }

    static int factorialLoop(int n) { //n! = 1 * 2 .. * (n-1) * n
        int result = 1; //k! = 1 * 2 .. * k,   k = n-1:   (n-1)! = 1 * 2 * .. * (n-1)
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int factorialRec(int n) { // n! = (n-1)! * n,  1! = 1
        if (n == 1) {
            return 1;
        } else {
            return n * factorialRec(n-1);
        }
    }

}
