package leet594;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findLHS(int[] nums) {
       Arrays.sort(nums);
       int res=0;
       int begin=0;

        for (int end = 0; end <nums.length ; end++) {
            while (nums[end]-nums[begin]>1){
                begin++;
            }
            if (nums[end]-nums[begin]==1){
                res=Math.max(res,end-begin+1);
            }
        }
        return res;
    }
}