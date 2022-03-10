package leet324;

import java.util.Arrays;

public class Solution {
    public void wiggleSort(int[] nums) {
        int[] ans=nums.clone();
        Arrays.sort(ans);
        int n= nums.length;
        for (int i = 1; i < nums.length ; i+=2) {
            nums[i]=ans[--n];
        }

        for (int i = 0; i < nums.length ; i+=2) {
            nums[i]=ans[--n];
        }

    }
}
