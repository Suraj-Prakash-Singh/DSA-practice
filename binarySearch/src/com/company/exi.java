package com.company;

import java.util.Arrays;

public class exi {
    public static void main(String[] args) {
        int [] arr={-1,1,0,-3,-3};
        int [] x=productArray(arr);
        System.out.println(Arrays.toString(x));
    }
    static int [] productArray(int [] arr){
        int product=1;
        int [] ans =new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0)
            product=product*arr[i];
        }
        for (int i = 0; i < arr.length ; i++) {
            ans[i]=(product/arr[i]);
        }
        return ans;
    }
}
