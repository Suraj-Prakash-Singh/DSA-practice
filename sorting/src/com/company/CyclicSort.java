package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int []arr={3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {

        int i=0;
        while(i< arr.length){
            int correct = arr[i]-1;// calculating correct index
            if(arr[i]!=arr[correct])
                swap(i,arr,correct);
            else
                i++;
        }

    }

    private static void swap(int first, int[]arr,int second ) {

       int temp = arr[first];
       arr[first] = arr[second];
       arr[second] = temp;

    }
}
