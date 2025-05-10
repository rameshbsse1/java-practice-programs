package com.example.test.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    int majorityElement(int[] nums) {
        int majority = nums[0];
        int votes = 1;

        for(int i=1; i<nums.length; i++) {
            if(votes == 0) {
                majority = nums[i];
                votes++;
            } else if(majority == nums[i]) {
                votes++;
            } else {
                votes--;
            }
        }
    return majority;
    }

    int findMajorityElementUsingHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println(map);

        Map<Integer, Integer> hm = new HashMap<>();

        for (int num: nums) {
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        System.out.println("get or default"+hm);

        int maxCount = 0;
        int majorityElement = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = majorityElement;
                majorityElement = entry.getKey();
            }
        }
        System.out.println(majorityElement);
        return majorityElement;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        //int majority = majorityElement.majorityElement(new int[] {2,2,1,3,1,2,2});
        //System.out.println(majority);
        majorityElement.findMajorityElementUsingHashMap(new int[] {2,2,1,3,1,2,2});

        int[] arr  = new int[] {2,2,1,3,1,2,2};
        int majority = arr[0];
        int votes = 1;
        for (int i=1; i< arr.length; i++) {
            if (arr[i] == majority){
                votes++;
            } else if(votes == 0){
                majority =arr[i];
                votes++;
            } else{
                votes--;
            }
        }
        System.out.println("majority--"+majority);
    }
}
