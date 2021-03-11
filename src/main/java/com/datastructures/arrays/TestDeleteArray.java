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
public class TestDeleteArray {
    public static void main(String[] args) {
        int[] array = {1,4,5,63,2};
        System.out.println("Original Array");
        Array.loopArray(array);
        System.out.println("Update Array");    
        array = Array.DeleteAValueOfArray(array,0);
        Array.loopArray(array);
    }
}
