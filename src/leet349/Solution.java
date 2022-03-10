package leet349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        for (int num:nums1){
            set.add(num);
        }


        for (int num:nums2){
            if (set.contains(num)){
                set1.add(num);
            }
        }
        return Arrays.stream(set1.toArray(new Integer[0])).mapToInt(Integer::valueOf).toArray();

    }
}
