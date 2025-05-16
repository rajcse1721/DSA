package com.data_structure.ArrayProgram;

import java.util.Arrays;

public class MiddleFunction {
    public static int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0];
        }
        int[] middleArray = new int[array.length - 2];
        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }
        return middleArray;
    }

    public static void main(String[] args) {
        int[] result = middle(new int[] { 1, 2 });
        System.out.println(Arrays.toString(result));
    }

}
