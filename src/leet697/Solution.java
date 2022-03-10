package leet697;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findShortestSubArray(int[] nums) {
      Map<Integer,int[]> map=new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int num=nums[i];
            if (map.containsKey(num)){
                map.get(num)[0]++;
                map.get(num)[2]=i;
            }else {
                map.put(num,new int[]{1,i,i});
            }
        }
        int maxNum=0; int minLen=0;
        for (Map.Entry<Integer,int[]> entry:map.entrySet()){
            if (maxNum<entry.getValue()[0]){
                maxNum=entry.getValue()[0];
                minLen=entry.getValue()[2]-entry.getValue()[1]+1;
            }else if(maxNum==entry.getValue()[0]){
                minLen=Math.min(minLen,entry.getValue()[2]-entry.getValue()[1]+1);
            }
        }
        return minLen;



    }
}