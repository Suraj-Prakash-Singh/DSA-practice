package com.company;

public class Stringhalves {
    public static void main(String[] args) {

        String s="AbCdEfGh";
        System.out.println(halvesAreAlike(s));
    }
    private static boolean halvesAreAlike(String s) {

        int n = s.length();
        int count1=0;
        int count2=0;

        for(int i=0;i<n/2;i++){

            if(s.charAt(i)=='a' || s.charAt(i)=='A' )
                count1++;
            if(s.charAt(i)=='e' || s.charAt(i)=='E' )
                count1++;
            if(s.charAt(i)=='i' || s.charAt(i)=='I')
                count1++;
            if(s.charAt(i)=='o' || s.charAt(i)=='O')
                count1++;
            if(s.charAt(i)=='u' || s.charAt(i)=='U')
                count1++;

        }

        for(int i=n/2;i<n;i++){

            if(s.charAt(i)=='a' || s.charAt(i)=='A' )
                count2++;
            if(s.charAt(i)=='e' || s.charAt(i)=='E' )
                count2++;
            if(s.charAt(i)=='i' || s.charAt(i)=='I')
                count2++;
            if(s.charAt(i)=='o' || s.charAt(i)=='O')
                count2++;
            if(s.charAt(i)=='u' || s.charAt(i)=='U')
                count2++;

        }

        return count1==count2;

    }
}
