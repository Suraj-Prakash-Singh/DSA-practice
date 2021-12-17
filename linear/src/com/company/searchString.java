package com.company;

public class searchString {
    public static void main(String[] args) {
        String name = "Suraj";
        char target ='x';
        System.out.println(charPresent(name,target));
    }

    static boolean charPresent(String name,char ch){
        if(name.length()==0)
            return false;
       char[] ans= name.toCharArray();

        for (int i = 0; i < ans.length ; i++) {
            char x = ans[i];

            if(x==ch){
                return true;
            }

        }

//        for (int i = 0; i <name.length() ; i++) {
//            char y =name.charAt(i);
//
//            if(y==ch){
//                return true;
//            }
//
//
//        }
        return false;

    }
}
