package leet121;

public class Solution {
    public int maxProfit(int[] prices) {
        int[] dp=new int[prices.length];
        dp[0]=0;
        for (int i = 1; i < prices.length; i++) {
            dp[i]=prices[i]-prices[i-1];
        }
        int max=0;
        for (int i = 1; i < dp.length ; i++) {
            dp[i]=Math.max(dp[i],dp[i-1]+dp[i]);

            max=Math.max(dp[i],max);
        }
        return max;
    }

}
