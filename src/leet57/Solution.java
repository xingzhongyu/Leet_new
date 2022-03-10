package leet57;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans=new ArrayList<>();
        for (int i=0;i<intervals.length;i++){
            int[] nums=intervals[i];
            if (nums[1]<newInterval[0]){
                ans.add(nums);

            }else if (newInterval[0]>=nums[0]){
                newInterval[0]=nums[0];
                newInterval[1]=Math.max(nums[1],newInterval[1]);
            }else if (newInterval[1]<nums[0]){
                ans.add(newInterval);
                for (int j = i; j <intervals.length ; j++) {
                    ans.add(intervals[j]);
                }
                newInterval=null;
                break;
            }else if (newInterval[1]<nums[1]){
                newInterval[1]=nums[1];

            }
        }
        if (newInterval!=null){
            ans.add(newInterval);
        }
        int[][] nums=new int[ans.size()][];

        for (int i = 0; i <nums.length ; i++) {
            nums[i]= ans.get(i);
        }


        return nums;

    }
}
