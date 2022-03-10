package leet453;

public class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min>nums[i]){
                min=nums[i];
            }
        }
        int ans=0;
        for (int num : nums) {

            ans = ans + num - min;

        }
        return ans;
    }
}