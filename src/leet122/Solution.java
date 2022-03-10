package leet122;

public class Solution {
    public int maxProfit(int[] prices) {
        int[] dp=new int[prices.length];
        dp[0]=0;
        for (int i = 1; i <prices.length ; i++) {
            dp[i]=prices[i]-prices[i-1];
        }
        boolean have=false;
        int ans=0;
        for (int i = 1; i < dp.length; i++) {

            if (have){
                if (dp[i]<0){
                    ans=ans+prices[i-1];
                    have=false;
                }
            }else {
                if (dp[i]>0){
                    ans=ans-prices[i-1];
                    have=true;
                }
            }
        }
        if (have){
            ans+=prices[prices.length-1];
        }
        return ans;
    }
}