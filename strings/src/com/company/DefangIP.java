package com.company;

public class DefangIP {
    public static void main(String[] args) {

        String address ="255.100.50.0";
        System.out.println(defangIPaddr(address));


    }
    private static String defangIPaddr(String address) {
        String ans = "";
        for (int i = 0; i <address.length() ; i++) {

            ans =  address.replace(".","[.]");


        }
        return ans;
    }
}
