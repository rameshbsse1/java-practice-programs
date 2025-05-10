package com.example.test.leetcode.easy;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeros(int[] nums) {
        int nonZeroIndex = 0;

        for(int i=0; i<nums.length; i++) {
           if (nums[i] != 0) {
               nums[nonZeroIndex] = nums[i];
               nonZeroIndex++;
           }
        }

        System.out.println(Arrays.toString(nums));
        while ( nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }

        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeros(nums1);
    }
}
