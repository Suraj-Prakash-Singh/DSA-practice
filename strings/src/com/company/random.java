package com.company;

public class random {
    public static void main(String[] args) {

        String s ="elLo";
        System.out.println(toLowerCase(s));

    }
    private static String toLowerCase(String s) {
        int m=0;

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {

            if((s.charAt(i)>64) && (s.charAt(i)<91))
            {
                m = s.charAt(i)+32;
                char n = ((char) m);
                ans.append(n);
            }
            else
                ans.append(s.charAt(i));
        }

        String x = "";
        x=ans.toString();
        return x;


    }

}
