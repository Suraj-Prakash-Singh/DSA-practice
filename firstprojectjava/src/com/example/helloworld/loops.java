package com.example.helloworld;

public class loops {
    public static void main(String[] args) {
        //for loops
        //contains three parts (initialization,condition,updation)
        //initialization part runs for only one time

        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }

        //while loop
        //while(condition){
        //set of instruction
        //updation}

        int j=1;
        while(j<5)
        {
            System.out.println(j);
            j++;
        }

        //do while
        //do{
        // code
        // updation}
        //while(condition)

        int s=10;
        do{
            System.out.println(s);
            s--;
        }while(s>=1);
    }
}
