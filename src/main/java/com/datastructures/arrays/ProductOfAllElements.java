/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructures.arrays;

import java.util.stream.Stream;

/**
 *
 * @author anonimo
 */
public class ProductOfAllElements {
    public static void printAllElements(int[] array){
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static int[] solution1(int[] array){
        int[] arrayResults = new int[array.length];
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result *= array[i];
        }
        for (int i = 0; i < array.length; i++) {    
            arrayResults[i] = result / array[i];
        }
        return arrayResults;
    }
    
    public static int[] solution2(int[] array){
        int[] arrayResults = new int[array.length];
        int[] arrayTemporal = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i] != array[j]){
                    arrayTemporal[count++] = array[j];
                }
            }
            int result = arrayTemporal[0];
            for (int j = 1; j < arrayTemporal.length; j++){
                result *= arrayTemporal[j];
            }
            arrayTemporal = new int[array.length - 1];
            arrayResults[i] = result;
        }
        return arrayResults;
    }
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        printAllElements(solution1(array));
        printAllElements(solution2(array));
    }
}
