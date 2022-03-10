package leet334;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length<3){
            return false;
        }
        int min1=Integer.MAX_VALUE;
        int min2=nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i]>min1){
                return true;

            }
            min2=Math.min(min2,nums[i]);
            if (nums[i]>min2){
                min1=Math.min(min1,nums[i]);
            }


        }
        return false;
    }
}
