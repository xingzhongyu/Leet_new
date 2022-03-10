package leet396;

public class Solution {
    public int maxRotateFunction(int[] nums) {
        int max=0 ;
        int sum=0;

        for (int i = 0; i < nums.length ; i++) {
            sum+=nums[i];
            max+=nums[i]*i;
        }
        int next=max;

        for (int i = 1; i <nums.length ; i++) {
            next=next+sum- nums.length*nums[nums.length-i];
            max=Math.max(next,max);
        }
        return max;
    }

}
