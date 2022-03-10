package leet659;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map=new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int x=nums[i];
            if (!map.containsKey(x)){

                map.put(x,new PriorityQueue<>());
            }
            if (map.containsKey(x-1)){
              int preLength=map.get(x-1).poll();
                if (map.get(x-1).isEmpty()){
                    map.remove(x-1);
                }
                map.get(x).offer(preLength+1);

            }else {
                map.get(x).offer(1);
            }
        }
        for (int key:map.keySet()){
            if (map.get(key).peek()<3){
                return false;
            }
        }
        return true;
    }
}
