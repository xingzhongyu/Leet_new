package leet506;

import java.util.Arrays;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] nums=new int[score.length];
        Arrays.fill(nums,1);
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (score[i]>score[j]){
                    nums[j]++;

                }else if (score[i]<score[j]){
                    nums[i]++;
                }
            }
        }
        String[] ans=new String[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]==1){
                ans[i]="Gold Medal";
            }else if (nums[i]==2){
                ans[i]="Silver Medal";
            }else if (nums[i]==3){
                ans[i]="Bronze Medal";
            }else {
                ans[i]=String.valueOf(nums[i]);
            }
        }
        return ans;

    }
}
