package com.company;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int []arr={1,3,8,15,16,17,20,21,22,25,26};
        int target=25;
       int finalans= findRange(arr,target);
        System.out.println(finalans);
    }
    private static int findRange(int[] arr,int target){
        int start =0;
        int end =1;
        while(target>arr[end]){
          int newstart = end+1;
          end=(end-start+1)*2;
          start=newstart;
        }
        return find(arr,target,start,end);
    }

    private static int find(int[] arr, int target,int start,int end) {
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
