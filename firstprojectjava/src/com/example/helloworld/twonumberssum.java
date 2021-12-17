package com.example.helloworld;

import java.util.Scanner;

public class twonumberssum {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number ");
        a=myobj.nextInt();
        System.out.println("Enter second number ");
        b=myobj.nextInt();

        c=a+b;

        System.out.println("Sum is "+c);
    }
}
