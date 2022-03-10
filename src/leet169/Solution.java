package leet169;

import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int before=nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i]!=before){
                count--;
                if (count==0){

                    before=nums[i];
                    count=1;
                }
            }else {
                count++;
            }
        }
        return before;
    }
}