package com.company;

import java.util.Arrays;

;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {42, 39, 26, 12, 11, 19};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        //run the outer loops n-1 times
        for(int i=0;i< arr.length;i++){
            //run the inner loops for n-i-1 times
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
