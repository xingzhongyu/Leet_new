package leet523;

import java.util.*;

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length==1){
            return false;
        }
        Set<Integer> set=new HashSet<>();
        int pre=nums[0];
        int last=0;

        for (int i = 1; i < nums.length ; i++) {
            pre+=nums[i];
            last+=nums[i-1];
            int count=0;
            if (pre%k==0){
                return true;
            }
            while (count<=pre/k){
                if (set.contains(pre-count*k)){
                    return true;
                }
                count++;
            }
            set.add(last);
        }
        return false;


    }
}
