package com.company;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        if(accounts.length==0){
            return 0;
        }
        int maxi =0;
        for (int row = 0; row <accounts.length ; row++) {
           int ans= sum(accounts[row]);

            if(ans>maxi){
                maxi=ans;
            }
        }
        return maxi;


    }
    static int sum(int[]row){
        int initial=0;
        for (int column = 0; column <row.length ; column++) {
            initial=initial+row[column];
        }
        return initial;
    }

}

