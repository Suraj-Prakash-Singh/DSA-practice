package com.company;

public class question {
    public static void main(String[] args) {
        int []arr = {2,5,0,0};
        int n = 4;

        System.out.println(minJumps(arr,n));
    }

    private static boolean minJumps(int[] nums, int n) {
        int step = 0;
        int i = 0;
        while( i<nums.length-1){
            if(nums[i]==0)
                return false;

            i = i + nums[i];
            step++;

        }
        if(i>=nums.length-1)
            return true;
        else return false;
    }
}
