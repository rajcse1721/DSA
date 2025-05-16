package com.data_structure.ArrayProgram;

public class PrintPairs {

    public static void pairMethod(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                System.out.println("Pair : " + arrays[i] + arrays[j]);
            }
        }
    }

    public static void main(String[] args) {
        int result[] = { 1, 2, 3, 4 };
        pairMethod(result);
    }

}
