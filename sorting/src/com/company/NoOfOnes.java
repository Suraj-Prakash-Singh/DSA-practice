package com.company;

public class NoOfOnes {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        System.out.println(ans(arr));

    }

    private static int ans(int[] arr) {
        int first = first(arr,1);
        int last = last(arr,1);

        return last-first+1;

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
