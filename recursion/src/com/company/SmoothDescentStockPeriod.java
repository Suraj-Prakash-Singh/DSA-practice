package com.company;

public class SmoothDescentStockPeriod {
    public static void main(String[] args) {

        int [] prices = {3,2,1,4};
        System.out.println(getDescentPeriods(prices));

    }

    private static long getDescentPeriods(int[] prices) {

      int start = 0;
      int end ;
      long ans = 1;

        for (end= 1; end <prices.length ; end++) {

            if(prices[end]==prices[end-1] - 1 )
            {
                ans+=end-start+1;
            }
            else{
                start = end;
                ans += end-start+1;

            }

        }

        return ans;

    }
}
