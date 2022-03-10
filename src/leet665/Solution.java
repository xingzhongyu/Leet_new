package leet665;

public class Solution {
    public boolean checkPossibility(int[] nums) {
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i]<nums[i-1]){
                if (i== nums.length-1){
                    nums[i]=nums[i-1]+1;
                }else if (nums[i+1]>=nums[i-1]){
                    nums[i]=nums[i-1];
                }else {
                    nums[i-1]=nums[i];
                }
                break;
            }
        }
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i-1]>nums[i]){
                return false;
            }
        }
        return true;
    }
}