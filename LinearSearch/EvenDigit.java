package com.arif;

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 37, 36, 5467};
//        System.out.println(findNumbers(nums));
        System.out.println(numberOfDigits(0));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {
        if (numberOfDigits(num) % 2 == 0) {
            return true;
        }
        return false;
    }
        static int numberOfDigits (int num) {
            if (num < 0) {
            num *= -1;
        }
            if (num == 0) {
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
        }


//        static int numberOfDigits (int num) {
//        if (num < 0) {
//            num *= -1;
//        }
//        if (num == 0) {
//            return 1;
//        }
//        int count = 0;
//        while (num > 0) {
//            num = num / 10;
//            count++;
//
//        }
//        return count;
//    }
}
