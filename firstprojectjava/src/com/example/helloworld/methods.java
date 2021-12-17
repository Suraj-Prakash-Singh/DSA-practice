package com.example.helloworld;

import java.util.Scanner;

public class methods {

    static void eligibility(int number){
        if(number>18)
            System.out.println("You are adult ");

        else
            System.out.println("You are a minor");

    }
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        int age;

        System.out.println("Enter your age ");
        age=myObj.nextInt();
        eligibility(age);

    }
}
