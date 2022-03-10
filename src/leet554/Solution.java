package leet554;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int n=wall.size();
        int sum = 0;
        Map<Integer,Integer> map=new HashMap<>();
        for (List<Integer> list:wall) {
            
            sum=0;
            for (int i=0;i<list.size()-1;i++) {
                sum+=list.get(i);
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int max=0;
        for (int num: map.keySet()){
           max=Math.max(map.get(num),max);
        }
        return n-max;
    }
}