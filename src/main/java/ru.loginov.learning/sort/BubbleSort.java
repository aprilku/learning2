package ru.loginov.learning.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 21, 9};
        bubble(arr);
        for (int elem : arr) {
            System.out.println(elem);
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean hasChanges;
        do {
            hasChanges = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i]; //swap
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    hasChanges = true;
                }
            }
        } while (hasChanges);
    }


    public static void bubble(int[] arr){
        boolean haschan;
        do{
            haschan = false;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = arr[i];
                    haschan = true;
                }
            }
        }while(haschan);
    }
}
