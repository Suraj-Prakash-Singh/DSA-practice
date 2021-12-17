package com.company;

public class searchinMountain {
    public static void main(String[] args) {
        int []mountainArr={0,1,2,4,2,1};
        int peak=peakIndexInMountainArray(mountainArr);
        int ans=BsAscending(mountainArr,3,peak);
        if(ans == -1){
            ans=BsDescending(mountainArr,3,peak);
        }
        System.out.println(ans);

    }
    static int BsAscending(int[]arr,int target,int peak){
        int start=0;
        int end=peak;
        while(start<end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return -1;
    }
    static int BsDescending(int []arr,int target,int peak){
        int start = peak+1;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return -1;
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
