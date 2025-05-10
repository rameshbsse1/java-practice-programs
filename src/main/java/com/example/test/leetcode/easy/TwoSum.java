package com.example.test.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i< arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No two sums found");
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(TwoSum.findTwoSum(new int[]{16, 4, 23, 8, 15, 42, 1, 2}, 19)));

    }
}
