package com.example.test.corejava;

import java.util.Arrays;

public class ArraySort {

    public static void sortArrayUsingForLoop(Integer[] arr) {
        int temp = 0;
        for (int i=0; i< arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArrayByFrequencyCount(Integer[] arr) {
        int a=0 ,b=0, c =0;
        for (int num : arr) {
            if (num ==0) a++;
            else if (num ==1) b++;
            else c++;
        }
        int index = 0;
        while(a-- > 0)
            arr[index++] = 0;
        while(b-- >0)
            arr[index++] = 1;
        while (c-- >0)
            arr[index++] = 2;
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));
    }



    public static void main(String[] args) {
        ArraySort.sortArrayUsingForLoop(new Integer[] {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1});
        ArraySort.sortArrayByFrequencyCount(new Integer[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1});
        System.out.println();
        ArraySort.sortArrayUsingForLoop1(new int[] {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1});
        ArraySort.sortArrayUsingCountOccurance(new int[] {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1});
    }


    public static void sortArrayUsingForLoop1(int[] arr) {
        int temp = 0;
        for (int i=0; i< arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void sortArrayUsingCountOccurance(int[] arr){
        int a=0, b=0, c = 0;
        for (int num: arr) {
            if(num ==0) a++;
            else if(num==1) b++;
            else c++;
        }

        int index = 0;
        while(a-- >0) arr[index++] = 0;
        while(b-- >0) arr[index++] =1;
        while(c-- >0) arr[index++]=2;
        System.out.println(Arrays.toString(arr));
    }

}
