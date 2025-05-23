package com.example.test.leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the first string as prefix
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the start of the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

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
        System.out.println(lcp.longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // Output: "fl"
        System.out.println(lcp.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));     // Output: ""
        lcp.longestCommonPrefixTwo(new String[]{"flower", "flow", "flight"});
        lcp.longestCommonPrefixTwo(new String[]{"dog", "racecar", "car"});

    }
}

