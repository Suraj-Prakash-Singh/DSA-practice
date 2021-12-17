package com.company;

import java.util.Scanner;

public class arguments {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String ans = greeting(name);
        System.out.println(ans);
    }

    static String greeting(String naam) {
        String fina= "Nice name "+"'"+naam+"'";
        return fina;

    }
}
