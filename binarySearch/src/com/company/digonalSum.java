package com.company;

public class digonalSum {
    public static void main(String[] args) {
        int[][]arr={{1,2,4},{4,5,6},{10,8,-12}};
        System.out.println(diagonalDiff(arr));
    }

    private static int diagonalDiff(int[][] arr) {
        int sum1=0;
        int sum2=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(i==j){
                    sum1=sum1+arr[i][j];
                }

            }

        }
        for (int i = arr.length-1; i>=0  ; i--) {
            for (int j = 0; j<arr[i].length;j++) {
                if(i==j){
                    sum2=sum2+arr[i][j];
                }

            }

        }
        int diff=sum1-sum2;
        if(diff<0){
            diff=diff*-1;
        }
        return diff;
    }
}
