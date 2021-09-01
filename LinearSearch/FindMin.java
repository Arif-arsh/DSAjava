package com.arif;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {12, 34, 56, 3, 78, 5, 8};
        System.out.println(Min(nums));

    }
    static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
