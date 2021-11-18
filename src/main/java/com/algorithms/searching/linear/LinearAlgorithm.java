package com.algorithms.searching.linear;

public class LinearAlgorithm {

    public static int search(int element, int[] array){
        int result = -1;
        for(int i = 0; i < array.length;i++){
            if(element == array[i]){
                return i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,7,8,6,95};
        int element = 10;
        System.out.println(search(element, array));

    }
}
