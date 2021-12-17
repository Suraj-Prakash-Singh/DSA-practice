package com.company;
//Given an integer array nums and an integer k, return true if nums has a continuous subarray of size at least two whose elements sum up to a multiple of k, or false otherwise.
//
//        An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinuousSubarraySum {
    //2000000000
    public static void main(String[] args) {
       int [] nums = {23,2,6,4,7};
       int k = 13;
       System.out.println(checkSubarraySum(nums,k));
    }

    private static boolean checkSubarraySum(int[] nums, int k) {

        for(int i =0;i<nums.length;i++){
            int sum = nums[i];
            for(int j = i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum%k==0)
                    return true;
            }
        }

        return false;

    }


}
