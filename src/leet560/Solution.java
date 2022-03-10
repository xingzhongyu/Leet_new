package leet560;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] dp=new int[nums.length];
        int ans=0;
        dp[0]=nums[0];
        if (dp[0]==k){
            ans++;
        }
        for (int i = 1; i < nums.length ; i++) {
            dp[i]=dp[i-1]+nums[i];
            for (int j=0;j<=i;j++){
              if (dp[i]-dp[j]+nums[j]==k)
                  ans++;

            }

        }

        return ans;
    }
}
