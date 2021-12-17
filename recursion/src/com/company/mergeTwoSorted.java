package com.company;

import java.util.Arrays;

public class mergeTwoSorted {
    public static void main(String[] args) {
        int N = 6, M = 2;
        int[] arr1 = {2,3,7,8,14,16};
        int[] arr2 = {5,8};
        merge(arr1,arr2,N,M);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

   private static void merge(int []arr1, int []arr2, int n, int m) {



        for(int i=0;i<n;i++){
            for (int j = 0; j <m; j++) {

            if(arr1[i]>arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
        }

        }
       Arrays.sort(arr2);
        // code here
    }
}
