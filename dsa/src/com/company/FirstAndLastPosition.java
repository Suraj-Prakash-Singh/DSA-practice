package com.company;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int []arr={5,7,7,7,7,8,8,10};
        int target=7;

        System.out.println(Arrays.toString(findPos(arr, target)));
    }

    private static int[] findPos(int[] arr, int target) {
        int []ans = {-1,-1};
        ans[0] = first(arr,target);
        ans[1] = last(arr,target);
        return ans;
    }

    private static int first(int[] arr, int target) {
        int start=0;
        int end= arr.length-1;
        int result =-1;

        while(start<=end){
            int mid= start+(end-start)/2;

            if(arr[mid]==target){
                result=mid;
                end=mid-1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
    private static int last(int[] arr, int target) {
        int start=0;
        int end= arr.length-1;
        int result =-1;

        while(start<=end){
            int mid= start+(end-start)/2;

            if(arr[mid]==target){
                result=mid;
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
}
