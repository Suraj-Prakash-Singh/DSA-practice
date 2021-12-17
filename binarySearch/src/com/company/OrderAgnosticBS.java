package com.company;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={111,99,88,77,66,55,44,33,22,11,1};
        int target=1;
        int ans=search(arr,target);
        System.out.println(ans);
    }

     static int search(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        boolean isAsc;
         isAsc= arr[start] < arr[end];

         while(start<=end){
             int mid = start + (end-start)/2;

             if(arr[mid]==target)
                 return mid;

             if(isAsc){
                 if(target<arr[mid])
                     end=mid-1;
                 else if(arr[mid]<target)
                     start=mid+1;
             }
             else {
                 if(target>arr[mid]){
                         end=mid-1;
                 }
                     else
                         start=mid+1;
             }

         }
         return -1;
    }

}
