package leet525;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int pre=0;
        int max=0;
        map.put(0,-1);
        for (int i = 0; i < nums.length ; i++) {

            if (nums[i]==1){

                pre++;
            }else {
                pre--;
            }
            if (map.containsKey(pre)){
                max=Math.max(max,i-map.get(pre));
            }else {
                map.put(pre,i);
            }
        }
        return max;



    }
}
