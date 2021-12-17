package com.company;

public class FirstMisssingPositive {
    public static void main(String[] args) {

            int []arr={3,4,-1,1};
            System.out.println(firstMissingPositive(arr));

    }

    private static int firstMissingPositive(int[] nums) {

        cyclicSort(nums);
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]!=i+1)
                return i+1;

        }
        return nums.length+1;
    }

    private static void cyclicSort(int[] arr) {

        int i=0;
        while(i< arr.length){
            int correct = arr[i]-1;// calculating correct index

            if(arr[i]!=i+1 && arr[i]>0 && arr[i]<= arr.length)
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
