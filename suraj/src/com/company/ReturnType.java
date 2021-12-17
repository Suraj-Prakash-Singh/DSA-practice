package com.company;

import java.util.Scanner;

public class ReturnType {
    public static void main(String[] args) {
        int ans = greet();
        System.out.println(ans);


    }
    static int greet(){
        System.out.print("Enter number 1 ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.print("Enter number 2 ");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        return sum;

    }
}
