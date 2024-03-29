package leet350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        List<Integer> list=new ArrayList<>();
        for (int num:nums2){
            if (map.containsKey(num)&&map.get(num)>0){
                map.put(num,map.get(num)-1);
                list.add(num);
            }
        }
        int[] ans=new int[list.size()];
        for (int i = 0; i <ans.length ; i++) {
            ans[i]=list.remove(0);
        }
        return ans;
    }
}