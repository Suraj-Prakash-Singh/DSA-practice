package com.company;

import java.util.Arrays;

public class ques {
    public static void main(String[] args) {

        int []arr = {5,25,75};
        int target = 100;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    private static int[] twoSum(int[] numbers, int target) {

        int difference;
        int ans;
        int []arr={-1,-1};
        for (int i = 0; i < numbers.length ; i++) {

            difference = target - numbers[i];
             ans = bs(numbers,difference);

             arr[0]=i+1;
             arr[1]=ans+1;

        }
        return arr;
    }
    private static int bs(int []arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target)
                return mid;

            else if(arr[mid]<target)
                start = mid+1;

            else
                end = mid -1;
        }
        return -1;
    }
}
