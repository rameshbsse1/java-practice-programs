package com.example.test.corejava;

public class FidelityCounterDemo {
    public static void main(String[] args) {
        // count the word occurences of fidelity
        String str = "Hi fi Fideli ty hello fi delity you f idelity ok Fide LITY";

        char[] target = {'f', 'i', 'd', 'e', 'l', 'i', 't', 'y'};

        char[] input = str.toCharArray();
        int matchIndex = 0;
        int count = 0;

        for (int i=0; i<input.length; i++) {
            char ch = input[i];
            if (ch == ' ')
                continue;
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch+32);
            }
            if (ch == target[matchIndex]) {
                matchIndex++;
                if(matchIndex == target.length){
                    count++;
                    matchIndex = 0;
                }
            } else {
                if(ch == target[0])
                    matchIndex = 1;
                else{
                    matchIndex = 0;
                }
            }
        }
        System.out.println("occurance count: "+count);

    }
}
