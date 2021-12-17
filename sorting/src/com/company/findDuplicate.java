package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        System.out.println(Arrays.toString(findDup(arr)));

    }

    private static int[] findDup(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> numbers = new ArrayList<>();
        int []ans={-1,-1};

        for (int i = 0; i < arr.length ; i++) {
            int next = (i+1)%arr.length;
            if(arr[i]==arr[next])
                numbers.add(arr[i]);
        }
        ans[0]=numbers.get(0);
        ans[1]=numbers.get(1);


        return ans;
    }


}
