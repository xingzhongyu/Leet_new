package leet477;

public class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans=0;
        for (int i = 0; i < 30; i++) {
            int c=0;
            for (int num : nums) {
                c += (num >> i & 1);
            }
            ans+=c*(nums.length-c);
        }


    return ans;
    }



}
