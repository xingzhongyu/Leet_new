package leet376;

public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length<2){
            return nums.length;
        }
        int upCount=1,downCount=1;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i]>nums[i-1]){
                upCount=Math.max(downCount+1,upCount);
            }else if (nums[i]<nums[i-1]){

                downCount=Math.max(upCount+1,downCount);
            }

        }
        return Math.max(upCount,downCount);

    }
}
