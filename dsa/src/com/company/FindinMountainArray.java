package com.company;

public class FindinMountainArray {
    public static void main(String[] args) {
        int []arr = {1,2,5,7,8,6,4,0};
        int target =4;
        int peak =findpeak(arr);
        int ans = findInMountain(arr,target,peak);
        System.out.println(ans);

    }

    private static int findInMountain(int[] arr, int target, int peak) {
        int start =0;
        int end = arr.length-1;

        if(arr[peak]==target){
            return peak;
        }
        if(arr[peak]>target){
            end=peak-1;
        }
        else if(arr[peak]<target){
            start=peak+1;
        }


        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target){
                end=mid-1;
            }
            else
                start=mid+1;


        }
        return -1;
    }

    private static int findpeak(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        if(arr.length==1)
            return 0;


        while(start<=end){
            int mid = start +(end-start)/2;
            if(mid>0 && mid<arr.length-1) {  //keep in mind the corner elements

                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                    return mid;

                else if (arr[mid + 1] > arr[mid]) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
            else if(mid==0){  //handling corner elements
                if(arr[0]>arr[1])
                    return 0;
                else
                    return 1;
            }
            else if(mid == arr.length-1){ //handling corner elements
                if(arr[arr.length-1]>arr[arr.length-2])
                    return arr.length-1;
                else
                    return arr.length-2;
            }
        }
        return -1;
    }
}
