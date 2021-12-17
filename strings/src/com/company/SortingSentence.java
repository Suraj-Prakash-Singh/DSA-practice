package com.company;

import java.util.ArrayList;

public class SortingSentence {
    public static void main(String[] args) {

        String  s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    private static  String sortSentence(String s) {

        String [] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();
        String [] fix = new String[arr.length];

        for (String value : arr) {

            int index = value.charAt(value.length() - 1) - 48;

        }

        return fix.toString();
    }
}
