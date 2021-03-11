/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructures.arrays;

/**
 *
 * @author anonimo
 */
public class Array {
    
    public static int[] InsertAValueToArray(int[] array,int position,int value){
        int[] newArray = null;
        if(position < array.length){
            int dimension = array.length + 1;
            newArray = new int[dimension];
            for (int i = 0; i < dimension-1; i++) {
                if(i == position){
                    newArray[i] =  value;
                    newArray[i+1] = array[i];
                }else if(i > position){
                    newArray[i+1] = array[i];
                }
                else{
                    newArray[i] =  array[i];
                }
            }
        }
        return newArray;
    }
    
    public static int[] DeleteAValueOfArray(int[] array,int position){
        int[] newArray = null;
        if(position < array.length){
            int dimension = array.length - 1;
            newArray = new int[dimension];
            for (int i = 0; i < dimension; i++) {
                if(i >= position){
                   newArray[i] =  array[i+1];
                }else{
                    newArray[i] =  array[i];
                }
            }
        }
        return newArray;
    }
    
    public static void loopArray(int[] array){
        if(array != null && array.length > 0){
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
