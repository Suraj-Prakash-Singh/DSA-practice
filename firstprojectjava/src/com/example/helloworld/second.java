package com.example.helloworld;

public class second {
    public static void main(String[] args) {
        int a,b,c;

        a=10;
        b=20;
        c=30;

        if(a>b&&a>c)
        {
            System.out.println("A is greatest");
        }
        else if(b>a&&b>c)
        {
            System.out.println("B is greatest");

        }
        else if(c>a&&c>b)
        {
            System.out.println("C is greatest");
        }

    }
}
