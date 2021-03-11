/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructures.arrays;

/**
 *
 * @author Felipe Galindo
 */
public class MaximuSumArray {
    /**
     * Calculate maximum subarray sum
     * Time Complexity: O(n^3)
     * @param array
     */
    public static int maximumSubarray(int[] array){
       int maximumSum = 0;
       for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                }
                if(sum > maximumSum){
                    maximumSum = sum;
                }
            }
        } 
       return maximumSum;
    }
    /**
     * Calculate maximum subarray sum
     * Time Complexity: O(n^3)
     * @param array
     */
    public static int maximumSubarray2(int[] array){
       int maximumSum = 0;
       for (int i = 0; i < array.length; i++) {
           int sum = 0; 
           for (int j = i; j < array.length; j++) {
               sum += array[j];
               if(sum > maximumSum){
                    maximumSum = sum;
                }
           }
        } 
       return maximumSum;
    }
    public static int kadane(int[] array){
        int max_so_far = 0;
        int max_ending_here = 0;
        for (int i = 0; i < array.length; i++) {
            max_ending_here = Math.max(array[i], max_ending_here + array[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
    
    public static void main(String[] args) {
        int[] array = {34,-50,42,14,-5,86};
        System.out.println("3 loops : " + maximumSubarray(array));
        System.out.println("2 loops : " + maximumSubarray2(array));
        System.out.println("kadane-algorithm : " + kadane(array));
    }
}
