package com.company;

import java.util.Arrays;

public class searchin2d {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},
                          {4,5,},
                          {6,7,8,9}};
       int[]ans= search(array,9);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(array));
    }
    static int[] search(int[][] array, int target){
        if(array.length==0){
            return new int[]{-1,-1};
        }

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(array[i][j]==target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }

    static int max(int[][]array){
        int max = 0;
        for (int rows = 0; rows <array.length ; rows++) {
            for (int col = 0; col <array[rows].length ; col++) {
                if(array[rows][col]>max){
                    max=array[rows][col];
                }

            }

        }return max;
    }
}
