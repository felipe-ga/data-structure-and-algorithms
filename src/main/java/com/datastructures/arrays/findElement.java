package com.datastructures.arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class findElement {
    public static int[] insertElement(int[] array,int index,int number){
        int[] newArray = null;
        if(index > -1 && index <= array.length - 1){
            newArray = new int[array.length + 1];
            for (int i = 0,j = 0; i < array.length; i++) {
                if(i < index){
                    newArray[i] = array[i];
                }else if(i == index){
                    newArray[i] = number;
                    newArray[i+1] = array[i];
                }else{
                    newArray[i+1] = array[i];
                }
            }
        }else{
            newArray = array;
        }
        return newArray;
    }
    public static int[] deleteElement(int[] array,int index){
        int[] newArray = null;
        if(index > -1 && index <= array.length - 1){
            newArray = new int[array.length - 1];
            for (int i = 0,j = 0; i < array.length; i++) {
                if(i != index){
                    newArray[j++] = array[i];
                }
            }
        }else{
            newArray = array;
        }
        return newArray;
    }
    public static boolean findElement(int[] array,int number){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                return true;
            }
        }
        return false;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(String.format("%d ",array[i]));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {1,5,68,4,52,45};
        int number = 100;
        System.out.println("Find an element:");
        if(findElement(array,number)){
            System.out.println(String.format("the %d exist in the array", number));
        }else{
            System.out.println(String.format("the %d dosen't exist in the array", number));
        }
        System.out.println("------------------------");
        System.out.println("Deleting an element:");
        System.out.println("Before deleting :");
        printArray(array);
        System.out.println("After deleting :");
        printArray(deleteElement(array,10));

        System.out.println("Inserting an element:");
        System.out.println("Before inserting :");
        printArray(array);
        System.out.println("After inserting :");
        printArray(insertElement(array,5,500));
    }
}
