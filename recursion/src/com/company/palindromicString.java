package com.company;

import java.util.Arrays;

public class palindromicString {
    public static void main(String[] args) {
        String []words = {"abc","car","ada","racecar","cool"};
        System.out.println(find(words));
    }

    private static String find(String[] words) {
        String ans = "";

        for (int i = 0; i < words.length ; i++) {

            char[] word = words[i].toCharArray();

            String x = rev(word);

            if(x.equals(words[i]))
                return words[i];

        }

        return ans;
    }

    private static String rev(char[] word) {

        int start = 0;
        int end = word.length-1;

        while(start<=end){
            char temp = word[start];
            word[start]=word[end];
            word[end]=temp;
            start++;
            end--;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < word.length ; i++) {
            ans.append(word[i]);

        }

        return String.valueOf(ans);
    }
}
