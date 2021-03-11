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
public class TestInsertArray {
     public static void main(String[] args) {
        int[] array = {1,4,5,63,2};
        System.out.println("Array Original");
        Array.loopArray(array);
        array = Array.InsertAValueToArray(array,2,10);
        System.out.println("Update Original");
        Array.loopArray(array);
    }
}
