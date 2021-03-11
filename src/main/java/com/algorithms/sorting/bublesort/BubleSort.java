package com.algorithms.sorting.bublesort;

public class BubleSort {

    public static int[] bubleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(String.format("%d ",array[i]));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {4,2,5,4,3,2};
        System.out.println("Array before sorted");
        printArray(array);

        System.out.println("Array after sorted");
        printArray(bubleSort(array));
    }
}
