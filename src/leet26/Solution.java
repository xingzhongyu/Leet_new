package leet26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        for (int right = 0; right < nums.length ; right++) {
            nums[left]=nums[right];
            while (right+1< nums.length&&nums[right+1]==nums[left]){
                right++;
            }
            left++;
        }

        return left;

    }
}