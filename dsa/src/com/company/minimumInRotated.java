package com.company;

public class minimumInRotated {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        int n = arr.length;
        System.out.println(peakElement(arr,n));
        
    }
    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int start =0;
        int end = n-1;
        if(n==1)
            return 0;

        while(start<=end){
            int mid = start + (end-start)/2;

            int next = (mid+1)%n;
            int prev= (mid+n-1)%n;

            if(arr[mid]>arr[next] && arr[mid]>arr[prev])
                return mid;

            else if(arr[start]<arr[mid])
                start = mid+1;

            else if(arr[mid]<arr[end])
                end = mid-1;
        }
        return -1;}
}
