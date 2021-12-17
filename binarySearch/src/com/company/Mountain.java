package com.company;

public class Mountain {
    public static void main(String[] args) {
        int[] arr={0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static public int peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end=arr.length-1;
        while(start!=end){
            int mid =start+(end-start)/2;
            if (arr[mid] > arr[mid+1]) {
                //in the decreasing part of array
                //may be the ans but look at left
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                //in the increasing part of the array
                //this may be the ans but look at right
                start=mid+1;
            }
        }
        return start;
    }
}
