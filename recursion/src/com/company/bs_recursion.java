package com.company;

public class bs_recursion {
    public static void main(String[] args) {

        int []arr={40,52,57,69,102,205};
        int target = 102;
        System.out.println(binary_search(arr,102,0,arr.length-1));
    }
    private static int binary_search(int []arr,int target,int start,int end){
        if(start>end)
            return-1;

        int m = start+(end-start)/2;

        if(arr[m]==target)
            return m;

        if(arr[m]>target)
            return binary_search(arr,target,start,m-1);

        return binary_search(arr,target,m+1,end);
    }
}
