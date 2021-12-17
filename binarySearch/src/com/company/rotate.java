package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(0);
        arr.add(4);
        arr.add(9);
        arr.add(32);
        divideByFour(arr);

    }
    public static void divideByFour(ArrayList<Integer> arr){

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==0){
                arr.set(i,-1);
            }
            arr.set(i,arr.get(i)/4);
        }
        for (Integer integer : arr) {
            System.out.println(integer);

        }
        // Write your code here.
    }



}
