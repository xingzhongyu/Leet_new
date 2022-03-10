package leet18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        if (nums==null||nums.length<4){
            return list;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3 ; i++) {
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            if ((long)nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target){
                break;
            }
            if ((long)nums[i]+nums[nums.length-3]+nums[nums.length-2]+nums[nums.length-1]<target){
                continue;
            }
            for (int j = i+1; j < nums.length-2 ; j++) {
                if (j>i+1&&nums[j-1]==nums[j]){
                    continue;
                }
                if ((long)nums[i]+nums[j]+nums[j+1]+nums[j+2]>target){
                    break;
                }
                if ((long)nums[i]+nums[j]+nums[nums.length-1]+nums[nums.length-2]<target){
                    continue;
                }
                int sum=target-nums[i]-nums[j];
                int k=j+1;

                int l= nums.length-1;
                while (k<l){

                    if (nums[k]+nums[l]>sum){
                        l--;
                    }else if (nums[k]+nums[l]<sum){
                        k++;

                    }else {
                        list.add(List.of(nums[i],nums[j],nums[k],nums[l]));
                        while (k<l&&nums[k]==nums[k+1]){
                            k++;
                        }
                        while (k<l&&nums[l]==nums[l-1]){
                            l--;
                        }
                        l--;

                    }
                }
            }
        }
        return list;
    }
}
