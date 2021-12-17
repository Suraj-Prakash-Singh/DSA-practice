package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr={3,2,4};
        int target = 6;

        System.out.println(Arrays.toString(twosum(arr,target)));
    }
    private static int []twosum(int[]arr,int target){
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            myMap.put(arr[i],i);
        }
        int difference = 0;

        for (int i = 0; i <arr.length ; i++) {

            difference = target - arr[i];

            if(myMap.containsKey(difference))

                if(myMap.get(difference)!=i)
                return new int[]{i,myMap.get(difference)};

        }
        return new int[]{-1,-1};
    }
}
