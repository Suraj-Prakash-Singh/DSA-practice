package com.company;

import java.util.Arrays;

public class product {
    public static void main(String[] args) {

         char[]s={'h','e','l','l','o'};
        System.out.println(Arrays.toString(reverse(s)));
    }
    private static char[] reverse(char[] nums) {
        int start =0;
        int end = nums.length-1;
            while (start<=end){
                char temp = nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        return nums;
    }
}
