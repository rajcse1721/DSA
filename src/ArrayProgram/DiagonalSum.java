package com.data_structure.ArrayProgram;

import java.util.Arrays;

public class DiagonalSum {

    public static int[] sumDiagonalElement(int[][] array) {
        int tlbr = 0;
        int trbl = 0;

        for (int i = 0; i < array.length; i++) {
            tlbr += array[i][i];
            trbl += array[i][array.length - 1 - i];
        }
        // return tlbr;
        return new int[] { tlbr, trbl };
    }

    public static void main(String[] args) {
        // int result = sumDiagonalElement(new int[][] { { 8, 2, 6 }, { 4, 5, 6 }, { 7,
        // 8, 9 } });
        int[][] result = {
                { 9, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[] output = sumDiagonalElement(result);

        System.out.println(Arrays.toString(output));
    }

}
