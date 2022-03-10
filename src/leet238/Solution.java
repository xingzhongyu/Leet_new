package leet238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];
        output[output.length-1]=nums[nums.length-1];
        for (int i = output.length-2; i >=0 ; i--) {
            output[i]=nums[i]*output[i+1];
        }
        for (int i = 1; i < nums.length ; i++) {
            nums[i]=nums[i]*nums[i-1];
        }

        output[0]=output[1];

        for (int i = 1; i < output.length-1 ; i++) {
            output[i]=nums[i-1]*output[i+1];
        }
        output[output.length-1]=nums[nums.length-2];
        return output;
    }
}
