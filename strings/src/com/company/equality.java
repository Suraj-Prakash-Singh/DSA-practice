package com.company;

public class equality {
    public static void main(String[] args) {

        String [] word1={"wxgdwznoledlfeoilewsjziotnncyebhwpdnnimcorzovuiig","lycfb"};
        String [] word2={"wxgdwznoledlfeoilewsjzio","tnncyebhwpdnnimcor","iigl","yc","f","b","hnjm"};

        System.out.println(arrayStringsAreEqual(word1,word2));



    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        int length =Math.max(word1.length, word2.length);

        StringBuilder ans1= new StringBuilder();
        StringBuilder ans2= new StringBuilder();

        for (int i = 0; i <length ; i++) {

            if(i< word1.length)
            ans1.append(word1[i]);

            if(i< word2.length)
            ans2.append(word2[i]);
        }

        String x="";
        String y="";
        x= ans1.toString();
        y=ans2.toString();

        if(x.equals(y)){
            return true;
        }

        return false;

    }
}
