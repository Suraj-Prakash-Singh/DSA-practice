package com.company;

public class minimize_heights {
    public static void main(String[] args) {
        int k = 5;
        int n = 10;
        int []arr ={ 2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        System.out.println(getMinDiff(arr,n,k));
    }

    private static int getMinDiff(int[] arr, int n, int k) {
        for(int i = 0;i<n;i++){
            if((arr[i]-k) >0){
                arr[i] = arr[i]-k;
            }
            else
                arr[i] = arr[i]+k;
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {

            if(arr[i]>max)
                max = arr[i];

            if(arr[i]<min)
                min = arr[i];
        }
        return max-min;
    }
}
