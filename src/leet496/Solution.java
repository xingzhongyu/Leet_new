package leet496;

import java.util.*;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        list.add(nums2[0]);
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 1; i < nums2.length ; i++) {
            Iterator<Integer> iterator=list.iterator();
            while (iterator.hasNext()){

                int num=iterator.next();
                if (num<nums2[i]){
                    map.put(num,nums2[i]);
                    iterator.remove();
                }
            }
            list.add(nums2[i]);
        }
        for (int i = 0; i < nums1.length ; i++) {
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}