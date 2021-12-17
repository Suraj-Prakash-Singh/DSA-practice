package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        boolean ans =armstrong(n);
        System.out.println(ans);

    }
    static boolean armstrong(int a){

        int sum =0;
        int iniatial =a;
        while(a>0){
            int rem= a%10;
            int cube = rem*rem*rem;

            sum+=cube;
            a=a/10;
        }
        return iniatial==sum;



    }
}
