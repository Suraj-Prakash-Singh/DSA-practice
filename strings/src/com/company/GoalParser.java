package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class GoalParser {
    public static void main(String[] args) {

        String Command = "G()(al)";
        System.out.println(interpret(Command));
    }
    private static String interpret(String command) {

        ArrayList<Character> ans = new ArrayList<>();

        for (int i = 0; i <command.length() ; i++) {
            if(command.charAt(i)=='G')
                ans.add('G');

            if((command.charAt(i)=='(') && (command.charAt(i+1)==')'))
                ans.add('o');

            if((command.charAt(i)=='(') && (command.charAt(i+1)=='a'))
            {
                ans.add('a');
                ans.add('l');
            }
        }
        char[] x= new char[ans.size()];
        for (int i = 0; i < ans.size() ; i++) {
            x[i]=ans.get(i);
        }
        return String.valueOf(x);


    }
}
