package leet485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int temp=0;
        for (int num : nums) {
            if (num == 1) {
                temp++;
            }
            if (num == 0) {
                max = Math.max(max, temp);
                temp = 0;
            }
        }
        max=Math.max(max,temp);//!
        return max;
    }
}
