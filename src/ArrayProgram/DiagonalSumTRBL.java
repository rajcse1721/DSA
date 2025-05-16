package com.data_structure.ArrayProgram;

public class DiagonalSumTRBL {

    public static int DiagonalSumTLBRArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][array.length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = DiagonalSumTLBRArray(new int[][] {
                { 9, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        });
        System.out.println(result);
    }

}
