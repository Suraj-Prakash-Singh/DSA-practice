package com.company;

import java.util.ArrayList;

public class Jumpgame {
    public static void main(String[] args) {

        String s = "01111111011110";
        System.out.println(canReach(s,1,9));
    }
    private static boolean canReach(String s, int minJump, int maxJump) {

        ArrayList<Integer>indexes = new ArrayList<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='0')
                indexes.add(i);
        }
        boolean ans = false;

        int difference = s.length()-1;

        for (int i = indexes.size()-2; i >=0 ; i--) {

            if(difference-indexes.get(i)==minJump || difference-indexes.get(i)==maxJump || difference-indexes.get(i)==minJump+maxJump  || difference-indexes.get(i)==0) {
                difference = Math.abs(difference - indexes.get(i));
                ans = true;
            }

            else
                ans = false;
        }
        return ans;
    }
}
