package com.company;

import java.util.Scanner;
//finding 2nd minimum and 2nd maximum element in an array

public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        int []arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int i =0;i<n;i++){

            if(arr[i]>max)
                max = arr[i];

            if(min>arr[i])
                min = arr[i];

        }

        int smax= Integer.MIN_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){

            if(arr[i]<max && arr[i]>smax)
                smax = arr[i];

            if(arr[i]>min && arr[i]<smin)
                smin = arr[i];
        }

        System.out.print(smax);
        System.out.print(" ");
        System.out.print(smin);
    }
}
