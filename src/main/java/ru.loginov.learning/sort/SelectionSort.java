package ru.loginov.learning.sort;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {5, 9, 1, 4, 6, 7, 8, 3, 2, 8};
      // selectionSort(arr);
        sele2(arr);
        for (int elem : arr) {
            System.out.println(elem);
        }

    }

/*
находим номер минимального значения в текущем списке
производим обмен этого значения со значением первой неотсортированной позиции (обмен не нужен, если минимальный элемент уже находится на данной позиции)
теперь сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы
*/

    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }



    public static void sele2 (int[] arr){

        for(int i = 0; i < arr.length; i++){
            int minInd = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[minInd]){
                    minInd = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
    }
}

 /*   public static void selectionSort1(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length - 1; j++) {


                min = Math.min(arr[j], min);
                index = j;

            }
        }
    }
}
*/


