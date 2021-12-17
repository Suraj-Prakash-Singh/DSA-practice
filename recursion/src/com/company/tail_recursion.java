package com.company;

public class tail_recursion {
    public static void main(String[] args) {
        System.out.println(fun(8));
    }
    private static int fun(int n){

        if(n<=0)
            return 0;
        System.out.println(n);

            fun(2*n);
        System.out.println(n);
    return -1;
    }
}
