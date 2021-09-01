package com.arif;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {32, 54, 76, 78},
                {432, 6, 67},
                {12, 78, 90, 60},
                {99, 34}
        };
        System.out.println(Arrays.toString(search(nums, 60)));

    }
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
