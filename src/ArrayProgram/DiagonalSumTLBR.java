package com.data_structure.ArrayProgram;

public class DiagonalSumTLBR {

    public static int DiagonalTLBR(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
            // for (int j = 0; j < array.length; j++) {
            // if (i == j) {
            // sum += array[i][j];
            // }
            // }
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = DiagonalTLBR(new int[][] {
                { 9, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        });
        System.out.println(result);
    }

}
