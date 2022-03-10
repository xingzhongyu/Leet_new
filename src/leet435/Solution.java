package leet435;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));
        int count=1;
        int right=intervals[0][1];
        int ans=0;
        for (int i = 1; i <intervals.length ; i++) {

            if (intervals[i][0]>=right){
                ans+=(count-1);
                right=intervals[i][1];
                count=1;
            }else {
                right=Math.min(intervals[i][1],right);
                count++;
            }
        }
        ans+=(count-1);
        return ans;
    }
}