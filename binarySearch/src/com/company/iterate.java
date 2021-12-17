package com.company;

import java.util.ArrayList;
import java.util.List;

public class iterate {
    public static void main(String[] args) {
     List<Integer> arr =new ArrayList<Integer>();
     arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        miniMaxSum(arr);

    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int min=0;
        int max=0;
        int total=0;

        List<Integer> mylist= new ArrayList<Integer>();

        for(int i=0;i<arr.size();i++){
            total = total + arr.get(i);

        }
        for(int i=0;i<arr.size();i++){
            int except=0;
            except= total-arr.get(i);
            mylist.add(except);
        }
        for(int i=0;i<mylist.size();i++){
            if(mylist.get(i)>max){
                max=mylist.get(i);
            }
        }
        min= mylist.get(0);
        for(int i=0;i<mylist.size();i++){
            if(mylist.get(i)<min){
                min=mylist.get(i);
            }
        }

        System.out.println(min+" "+max);

    }

}

