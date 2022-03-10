package leet152;

public class Solution {
    public int maxProduct(int[] nums) {
        int maxF=nums[0], ans=nums[0],minF=nums[0];
        for (int i = 1; i < nums.length ; i++) {
            int mx=maxF,mn=minF;
            maxF=Math.max(mx*nums[i],Math.max(nums[i],mn*nums[i]));
            minF=Math.min(mn*nums[i],Math.min(nums[i],mx*nums[i]));
            ans=Math.max(ans,maxF);
        }
        return ans;

    }
}