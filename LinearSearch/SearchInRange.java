package com.arif;

public class SearchInRange {
    public static void main(String[] args) {
        int[] coll = {32, 34, 6, 56, 67, 4, 8};
        System.out.println(search(coll, 5, 1, 5));
    }
    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
            //OR
//            return Integer.MAX_VALUE;
        }
        for (int index = 0; index <= end; index++) {
//            if (arr[index] == target) {
//            return index;
//            }
            //OR
            int element = arr[index];
            if (element == target) {
//                return element;
                //OR
                return index;
            }
        }
        return -1;
        //OR
//        return Integer.MAX_VALUE;
    }
}
