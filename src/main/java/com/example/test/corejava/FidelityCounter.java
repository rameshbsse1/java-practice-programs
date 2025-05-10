package com.example.test.corejava;

public class FidelityCounter {
    public static void main(String[] args) {
        String str = "Hi fi Fideli ty hello fi delity you f idelity ok Fide LITY";
        char[] input = str.toCharArray();
        /*char[] input = {
                'H','i',' ','F','i','d','e','l','i',' ','t','y',' ',
                'h','e','l','l','o',' ','f','i',' ','d','e','l','i','t','y',' ',
                'y','o','u',' ','f',' ','i','d','e','l','i','t','y',' ',
                'o','k',' ','F','i','d','e',' ','L','I','T','Y'
        };*/

        char[] target = {'f','i','d','e','l','i','t','y'};
        int count = getCount(input, target);

        System.out.println("Occurrences of 'fidelity': " + count);
    }

    private static int getCount(char[] input, char[] target) {
        int count = 0;
        int matchIndex = 0;

        for (int i = 0; i < input.length; i++) {
            char ch = input[i];

            if (ch == ' ') continue;

            // Convert to lowercase manually
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            if (ch == target[matchIndex]) {
                matchIndex++;
                if (matchIndex == target.length) {
                    count++;
                    matchIndex = 0;
                }
            } else {
                // Mismatch, reset if not first char
                if (ch == target[0]) {
                    matchIndex = 1;
                } else {
                    matchIndex = 0;
                }
            }
        }
        StringBuilder sb = new StringBuilder("abc");
        String s = "abcc";
        return count;

    }
}
