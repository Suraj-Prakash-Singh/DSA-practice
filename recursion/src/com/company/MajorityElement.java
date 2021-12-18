package com.company;


// optimised solution in O(n) time and O(1) space

public class MajorityElement {
    public static void main(String[] args) {
        int []arr = {1,7,7,7,1,7,1,1,1};
        System.out.println(findMajority(arr));

    }

    private static int  findMajority(int[] arr) {

        int value = validCandidate(arr);
        int freq =0;

        for(int i =0;i<arr.length;i++){

            if(arr[i]==value)
                freq++;

        }

        if(freq > arr.length/2)
            return value;

        return -1;

    }

    private static int validCandidate(int[] arr) {
        int val = arr[0];
        int count = 0;

        for(int i =0; i<arr.length;i++){

            if(arr[i]==val)//same element, increment in frequency
                count++;

            else
                count--; //distinct element , do mapping

            if(count==0){
                val = arr[i];  //new element
                count = 1;
            }
        }
        return val;
    }
}
