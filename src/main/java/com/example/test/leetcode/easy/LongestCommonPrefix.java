package com.example.test.leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefixTwo(String[]  strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for(int i=0; i< first.length; i++) {
            if ( first[i] != last[i])
                break;
            sb.append(first[i]);
        }
        System.out.println("sb---->"+ sb);
        return  sb.toString();
    }

    // Test it
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        lcp.longestCommonPrefixTwo(new String[]{"flower", "flow", "flight"});
        lcp.longestCommonPrefixTwo(new String[]{"dog", "racecar", "car"});

    }
}

