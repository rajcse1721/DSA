package com.data_structure.ArrayProgram;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arrays) {
        for (int i = 0; i < arrays.length / 2; i++) {
            int temp = arrays[i];
            arrays[i] = arrays[arrays.length - i - 1];
            arrays[arrays.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arrays));
    }

    public static void main(String[] args) {
        int result[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        reverseArray(result);
    }

}
