package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        print(5);
    }

    static void print(int n){
        if(n>25)
            return;
        System.out.println(n);
        print(n+1);
    }
}
