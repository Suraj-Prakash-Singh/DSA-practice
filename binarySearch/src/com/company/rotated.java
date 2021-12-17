package com.company;

public class rotated {
    public static void main(String[] args) {

        int []arr={4,5,6,7,0,1,2};
        int target =0;
        int pivot=findMax(arr);
        System.out.println(find(arr,pivot,target));
    }

    private static int find(int[] arr, int pivot,int target) {
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<=arr[pivot]&&target<=arr[end]){
                start=mid+1;
            }
            else if(target<=arr[pivot]&&target>=arr[start]){
                end=mid-1;
            }
            else return-2;
        }
        return -1;

    }

    public static int findMax(int[] nums) {
        int start=0;

        int end=nums.length-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            int next=(mid+1)%nums.length;

            int previous=(mid+nums.length-1)%nums.length;

            if(nums[mid]<=nums[next] && nums[mid]<=nums[previous]){

                return  mid-1;

            }

            else {

                if(nums[mid]>=nums[start] && nums[mid]<=nums[end]){
                    return start-1; }

                else if(nums[mid]>=nums[start]){start=mid+1;}

                else if(nums[mid]<=nums[end]){end=mid-1;}

            }

        }

        return -1;

    }
}
