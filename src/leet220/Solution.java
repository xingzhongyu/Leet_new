package leet220;

import java.util.*;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set=new TreeSet<>();
        for (int i = 0; i < nums.length ; i++) {
            if (i>k){
                set.remove((long)nums[i-k-1]);
            }
            Long ceiling= set.ceiling((long) nums[i]-(long) t);



           if(ceiling!=null&&ceiling<=(long)nums[i]+(long)t){
                return true;
            }
            set.add((long)nums[i]);

        }
        return false;
    }
}