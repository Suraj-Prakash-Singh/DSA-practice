package com.company;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int []nums ={1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));

    }
    private static int[] findErrorNums(int[] nums) {
        cyclicSort(nums);
        int []ans={-1,-1};

        for(int i=0;i< nums.length;i++){
            if(nums[i]!=i+1) {
                ans[0]=nums[i];
                ans[1]=i+1;
            }
        }
        return ans;
    }

    private static void cyclicSort(int[] arr) {

        int i=0;
        while(i< arr.length){
            int correct = arr[i]-1;// calculating correct index
            if(arr[i]!=arr[correct])
                swap(i,arr,correct);
            else
                i++;
        }

    }

    private static void swap(int first, int[]arr,int second ) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
