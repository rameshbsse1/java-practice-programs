package com.example.test.leetcode.easy;

import java.util.*;
import java.util.stream.Collectors;

public class MoveZerosUsingList {

    public static List<Integer> moveAllZerosToEnd(List<Integer> numList) {
        int matchIndex = 0;

        for(int i=0; i<numList.size(); i++) {
            if (numList.get(i) != 0) {
                numList.set(matchIndex++, numList.get(i));
            }
        }
        while (matchIndex < numList.size()) {
            numList.set(matchIndex++, 0);
        }
        return numList;
    }



    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(Arrays.asList(0, 1, 0, 3, 12));
        List<Integer> resultList = MoveZerosUsingList.moveAllZerosToEnd(numList);
        System.out.println(resultList);

        int nonMatchIndex = 0;

        for (int i=0; i< numList.size(); i++) {
            if (numList.get(i) != 0) {
                numList.set(nonMatchIndex++, numList.get(i));
            }
        }
        while(nonMatchIndex < numList.size()) {
            numList.set(nonMatchIndex++, 0);
        }
        System.out.println("num list :"+numList);

        // Using Arrays
        int[] arr = new int[] {0,1,0,1,3};

        int index = 0;
        for(int i=0; i< arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while(index < arr.length) {
            arr[index] =0;
            index++;
        }
        System.out.println("arr->"+Arrays.toString(arr));
    }
}
