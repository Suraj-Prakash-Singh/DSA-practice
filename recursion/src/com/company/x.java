package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class x {
    public static void main(String[] args) {

        int first = 12,second =15 ;
        majority(first,second);
    }

    private static void  majority(int first,int second) {

        int count1 = 1;
        int count2 = 1;
        int n = first;
        int m = second;

        while(n!=m){
            n= first*count1++;
            m = second*count2++;
        }
        System.out.println(n);


    }


}
