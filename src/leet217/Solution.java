package leet217;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int num:nums){
            if (!set.add(num)){

                return true;
            }
        }

        return false;
    }
}
