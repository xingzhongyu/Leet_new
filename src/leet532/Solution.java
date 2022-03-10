package leet532;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for (int num:nums){
            set.add(num);
        }
        int sum=0;



        if (k==0){
            int ans=0;
            Map<Integer,Boolean> map=new HashMap<>();
            for (int num:nums){
                if (!map.containsKey(num)){
                    map.put(num,false);
                }else {
                    boolean another= map.get(num);
                    if (!another){
                        map.put(num,true);
                        ans++;
                    }
                }
            }
            return ans;
        }

        for (int integer:set){
            if (!set.contains(integer-k)){
                int num=integer;
                int length=0;
                while (set.contains(num+k)){
                    num+=k;
                    length++;
                }
                sum+=length;
            }
        }
        return sum;
    }
}
