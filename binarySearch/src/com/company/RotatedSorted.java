package com.company;

public class RotatedSorted {
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        System.out.println(findMin(arr));

    }
    public static int findMin(int[] nums) {
        int start=0;

        int end=nums.length-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            int next=(mid+1)%nums.length;

            int previous=(mid+nums.length-1)%nums.length;

            if(nums[mid]<=nums[next] && nums[mid]<=nums[previous]){

                return nums[mid];

            }

            else {

                if(nums[mid]>=nums[start] && nums[mid]<=nums[end]){
                    return nums[start]; }

                else if(nums[mid]>=nums[start]){start=mid+1;}

                else if(nums[mid]<=nums[end]){end=mid-1;}

            }

        }

        return -1;

    }
}
