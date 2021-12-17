package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stringmatvh {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("ab");
        strings.add("ab");
        strings.add("abc");

        ArrayList<String> queries = new ArrayList<String>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");

        System.out.println(Arrays.toString(matchingStrings(strings,queries)));


    }
    public static int[] matchingStrings(List<String> strings, List<String> queries) {
        int []arr=new int[queries.size()];
        // Write your code here
        for(int i=0;i<queries.size();i++){
            int ans= search(queries.get(i),strings);
            arr[i]=ans;

        }

        return arr;

    }

    public static int search(String queries, List<String> strings){
        int count=0;
        for(int i=0;i<strings.size();i++){
            if(strings.get(i).equals(queries)){
                count++;
            }
        }
        return count;
    }


}
