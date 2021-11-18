package com.algorithms.searching.binarysearch;

public class BinarySearchIterative {

    public static boolean search(int numberToFind, int[] array){
        int right = array.length - 1;
        int left = 0;

        while(left <= right){

            int middle = left + (right - left) / 2;

            if(array[middle] == numberToFind)
                return true;

            if(numberToFind < array[middle])
                right = middle - 1;

            if(numberToFind > array[middle])
                left = middle + 1;
        }

        return false;

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int numberToFind = 10;
        if(search(numberToFind,array)){
            System.out.printf("Number found");
        }else{
            System.out.printf("Number did not find");
        }
    }
}
