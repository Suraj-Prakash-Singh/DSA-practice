package com.company;

public class evenDigits {
    public static void main(String[] args) {
        int []nums={12,345,2,6,7896};
        System.out.println(counteven(nums));
    }
    static int counteven(int[]nums){
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            if(even(nums[i])){
                count++;
            }

        }
        return count;

    }
    static boolean even(int number){
        int digits =0;
        while(number>0){
            digits++;
            number=number/10;
        }
        if(digits%2==0){
            return true;
        }
        return false;
    }
}
