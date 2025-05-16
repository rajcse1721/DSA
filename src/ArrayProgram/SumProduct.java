package com.data_structure.ArrayProgram;

public class SumProduct {
    public static void sumProductArray(int[] arrays) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        for (int i = 0; i < arrays.length; i++) {
            product *= arrays[i];
        }
        System.out.println("sum:" + sum + "\tproduct :" + product);
    }

    public static void main(String[] args) {
        int[] result = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        sumProductArray(result);
    }

}
