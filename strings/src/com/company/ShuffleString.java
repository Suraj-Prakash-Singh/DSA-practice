package com.company;

import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";

        int [] indices = {4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s,indices));

    }
    private static String restoreString(String s, int[] indices) {
       char []arr = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {

            arr[indices[i]]=s.charAt(i);

        }
        String x = String.valueOf(arr);
        return x;


    }
}
