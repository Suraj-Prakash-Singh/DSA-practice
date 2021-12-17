package com.company;

public class Patterns {
    public static void main(String[] args) {
        
        int n =5;
        
        pattern (n);
    }
    
    private static void pattern (int n){


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if(i==n){
                int j =i;
                while(j<=n){
                    System.out.print("* ");
                    j--;
                }

            }

            
        }
        
    }
}
