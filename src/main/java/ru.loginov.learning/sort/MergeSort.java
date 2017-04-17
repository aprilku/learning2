package ru.loginov.learning.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 5, 7, 2, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int length = arr.length;
        if (length == 0 || length == 1) {
            return;
        }
        int[] left = copy(arr, 0, length / 2);
        int[] right = copy(arr, length / 2, length);
        sort(left);
        sort(right);
        int leftIndex = 0;
        int rightIndex = 0;
        while (true) {
            int i = leftIndex + rightIndex;
            if (rightIndex == right.length && leftIndex == left.length) {
                return;
            }
            if (rightIndex == right.length) {
                arr[i] = left[leftIndex];
                leftIndex++;
            } else if (leftIndex == left.length) {
                arr[i] = right[rightIndex];
                rightIndex++;
            } else {
                if (right[rightIndex] < left[leftIndex]) {
                    arr[i] = right[rightIndex];
                    rightIndex++;
                } else {
                    arr[i] = left[leftIndex];
                    leftIndex++;
                }
            }
        }
    }

    static int[] copy(int[] arr, int from, int to) { //from inclusive, to exclusive
        int[] result = new int[to - from];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[from + i];
        }
        return result;
    }

}
