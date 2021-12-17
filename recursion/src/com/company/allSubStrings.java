package com.company;

public class allSubStrings {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(subString(s));
    }

    private static String subString(String s) {
        for (int i = 0; i <s.length() ; i++) {

            for (int j = i; j <s.length() ; j++) {

                for (int k = i; k <=j ; k++) {

                    System.out.print(s.charAt(k)+"\t");

                }
                System.out.println();

            }

        }
        return null;
    }
}
