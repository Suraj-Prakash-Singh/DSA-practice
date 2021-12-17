package com.company;

public class examples {
    public static void main(String[] args) {
        String a = "Shivam";
        System.out.println(a);
        String b = a;
        System.out.println(a==b);

        String x = new String("nishant");
        String y = new String("nishant");

        System.out.println(x==y);

        a = "nice";
        System.out.println(b);
        int m = 10;
        int n = m;
        System.out.println(n);

        m =  12;
        System.out.println(n);
    }
}
