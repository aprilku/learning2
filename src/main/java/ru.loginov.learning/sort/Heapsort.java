package ru.loginov.learning.sort;

import java.util.Arrays;

/*
*       a
*    b     c
*  e f   g   -
*
*  1) a > b, a > c,   b > e, b > f,  c > g
*  2) разность длин не больше 1
*
*   { a, b, c , e, f, g }
*   i - родитель, то его дети на (i * 2 + 1), (i * 2 + 2)
*
*   1, 5, 3, 8, 7, 2
*
*      1
*    5
*
*      5
*    1   3
*
*     8
*   7   5
*  1 3   2
*
*
*     2
*   7   5
*  1 3   8
*  { 2, 7, 5, 1, 3, 8 }
*  { 2, 7, 5, 1, 3 }   8
*
* */


public class Heapsort {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 5, 7, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]) {
        int n = arr.length - 1;
        heapify(arr, n); //build
        System.out.println("--tree built--");
        for (int i = n; i > 0; i--) {
            System.out.println("swapping");
            swap(arr, 0, i);
            n--;
            maxheap(arr, 0, n);
        }
    }

    public static void heapify(int arr[], int n) {
        for (int i = n / 2; i >= 0; i--)
            maxheap(arr, i, n);
    }

    public static void maxheap(int arr[], int i, int n) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        System.out.println(String.format(
                "%s   i=%2s,  left=%2s,  right=%2s,  arr[i]=%2s,  arr[l]=%2s,  arr[r]=%2s",
                Arrays.toString(arr),
                i, left, right,
                arr[i],
                left <= n ? arr[left] : "--",
                right <= n ? arr[right] : "--"
        ));
        if (left <= n && arr[left] < arr[i]) //minheap or maxheap
            max = left;
        if (right <= n && arr[right] < arr[max]) //minheap or maxheap
            max = right;

        if (max != i) {
            swap(arr, i, max);
            maxheap(arr, max, n);
        }
    }

    public static void swap(int arr[], int i, int j) {
        System.out.println(String.format("%2s <-> %2s", arr[i], arr[j]));
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
