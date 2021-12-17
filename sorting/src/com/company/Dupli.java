package com.company;

public class Dupli {
    public static void main(String[] args) {
        int [] nums ={1,3,4,2,2};
        System.out.println(findDuplicate(nums));

    }
    private static int findDuplicate(int[] nums) {

        cyclicSort(nums);

        for (int i = 0; i <nums.length; i++) {
            if(nums[i]!=i+1)
                return nums[i];
        }

        return -1;
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
