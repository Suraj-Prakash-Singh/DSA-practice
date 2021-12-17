package com.company;

public class find {
    public static void main(String[] args) {
        int []A={3, 9, 18, 20, 17, 5, 1};
        int B = 5;
        System.out.println(solve(A,B));

    }
    private static int solve(int []A, int B){
        int peak=findpeak(A);

        int start = 0;
        int end = A.length-1;

        if(A[start]>B){
            start = peak+1;
        }
        else
            end = peak;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(A[mid]==B)
                return mid;
            else if(A[mid]>B)
                end = mid-1;
            else
                start = mid+1;
        }

        return -1;
    }
    private static int findpeak(int[] A) {
        int start = 0;
        int end = A.length-1;
        if(A.length==1)
            return 0;


        while(start<=end){
            int mid = start +(end-start)/2;
            if(mid>0 && mid<A.length-1) {  //keep in mind the corner elements

                if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1])
                    return mid;

                else if (A[mid + 1] > A[mid]) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
            else if(mid==0){  //handling corner elements
                if(A[0]>A[1])
                    return 0;
                else
                    return 1;
            }
            else if(mid == A.length-1){ //handling corner elements
                if(A[A.length-1]>A[A.length-2])
                    return A.length-1;
                else
                    return A.length-2;
            }
        }
        return -1;
    }
}
