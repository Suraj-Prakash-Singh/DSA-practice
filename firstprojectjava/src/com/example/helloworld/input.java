package com.example.helloworld;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        System.out.println("Enter your name");

        String userName;

        userName = myObj.nextLine();

        System.out.println("Name is "+ userName);

        //numerical input
        System.out.println("Enter your age");

        int age =myObj.nextInt();
        System.out.println("Enter your salary");

        double salary =myObj.nextDouble();
    }
}
