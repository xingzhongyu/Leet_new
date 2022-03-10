package leet128;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
     Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            set.add(nums[i]);
        }
        int max=0;



        for (int i = 0; i < nums.length ; i++) {
            if (!set.contains(nums[i]-1)){
                int num=nums[i];
                int length=1;
                while (set.contains(num+1)){
                    num++;
                    length++;
                }
                max=Math.max(length,max);
            }
        }
        return max;
    }

}
