package com.company;

public class binarySearch {

    public static void main(String[] args) {
	int[] arr={1,3,5,7,12,20};


    }

    static int BS(int[] arr ) {
        int start=0;
        int end = arr.length-1;
        int max=arr[0];

        while(start<=end){
            int mid = start + (end-start)/2;
            if(max>arr[mid-1]&& max<arr[mid+1]){
                return max;
            }
            if(arr[mid]>arr[mid+1])
                end=mid-1;

            else if(arr[mid]<arr[mid+1])
                start=mid+1;
            else
                return mid;

        }

        return-1;

    }


}
