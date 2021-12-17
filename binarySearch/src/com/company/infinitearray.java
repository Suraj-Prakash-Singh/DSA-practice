package com.company;

public class infinitearray {
    public static void main(String[] args) {
int []arr={3,5,6,21,55,78,109,155};

        int target=78;
        System.out.println(ans(arr,target));
    }
    static int ans(int []arr,int target){
        //create a chunk of small size
        int start=0;
        int end=1;

        while(target>arr[end]){
            //doubling the chunk
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[]arr,int target,int start,int end){


        while(start<=end){
            if(target>arr[end]){
                return arr[0];
            }
            int mid = start + (end-start)/2;
            if(arr[mid]>target)
                end=mid-1;
            else if(arr[mid]<target)
                start=mid+1;
            else
                return mid;

        }
        return-1;
    }
}
