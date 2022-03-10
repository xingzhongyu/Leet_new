package leet442;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        for (int i = 0; i < nums.length ; i++) {
            int x=(nums[i]-1)%n;//本地哈希从而得到相关取值，范围并进行计算
            nums[x]+=n;
        }

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]>2*n){
                list.add(i+1);

            }
        }
        return list;
    }
}