package com.company;

public class fib_recursion {
    public static void main(String[] args) {
        System.out.println(fibbonacci(50));
    }
    private static int fibbonacci(int n){

        if(n<2)
            return n;

        return fibbonacci(n-1)+ fibbonacci(n-2);

    }
}
