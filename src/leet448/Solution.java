package leet448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] ans=new boolean[nums.length];
        Arrays.fill(ans, false);
        for (int num : nums) {
            ans[num - 1] = true;
        }

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < ans.length ; i++) {
            if (!ans[i]){
                list.add(i+1);
            }
        }
        return list;




























    }
}