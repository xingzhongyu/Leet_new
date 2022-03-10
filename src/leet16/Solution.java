package leet16;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n= nums.length;
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        for (int first=0;first<n;first++){
            if (first>0&&nums[first]==nums[first-1]){
                continue;

            }
            int third=n-1;
            for (int second=first+1;second<nums.length;second++){
                if (second>first+1&&nums[second]==nums[second-1]){
                    continue;
                }
                while (second<third&&nums[first]+nums[second]+nums[third]>target){
                    third--;
                }


               if (third<n-1){
                   int k=nums[first]+nums[second]+nums[third+1];
                   if (Math.abs(ans-target)>Math.abs(k-target)){
                       ans=k;
                   }
               }
                if (second==third){
                    break;
                }
                int l=nums[first]+nums[second]+nums[third];

                if (l==target){
                    return target;
                }
                if (Math.abs(ans-target)>Math.abs(target-l)){
                    ans=l;
                }



            }
        }
        return ans;

    }
}