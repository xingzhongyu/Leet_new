package leet357;

public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n==0){
            return 1;
        }
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=9;
        for (int i = 2; i <=n ; i++) {
            dp[i]=dp[i-1]*(11-i);



            dp[i-1]+=dp[i-2];
        }
        return dp[n]+dp[n-1];
    }
}
