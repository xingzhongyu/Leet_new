package leet454;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map=getSum(nums1, nums2);
        int sum=0;
        for (int u:nums3){
            for (int v:nums4){
                if (map.containsKey(-u-v)){

                    sum+=map.get(-u-v);
                }
            }
        }
        return sum;
    }

    private Map<Integer,Integer> getSum(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1=new HashMap<>();
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j <nums2.length ; j++) {
                int num=nums1[i]+nums2[j];
                map1.put(num,map1.getOrDefault(num,0)+1);
            }
        }


        return map1;
    }
}