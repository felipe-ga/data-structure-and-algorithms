package com.algorithms.searching.jump;

public class JumpSearch {

    public static int jumpSearch(int x, int[] array){
        int result = -1;
        int step = (int)Math.floor(Math.sqrt(array.length));
        int star = 0;
        int end = step - 1;
        while (end < array.length - 1 && x > array[end]){
            star = end + 1;
            end += step;
        }
        for (int i = star; i < array.length && i < end; i++) {
            if(array[i] == x){
                return i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        int x = 11;
        System.out.println(jumpSearch(x, array));
    }
}
