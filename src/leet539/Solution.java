package leet539;

import java.util.List;

public class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] nums=new int[timePoints.size()];
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <timePoints.size() ; i++) {
            String[] strings=timePoints.get(i).split(":");
            int num=Integer.parseInt(strings[0])*60+Integer.parseInt(strings[1]);
            nums[i]=num;

            for (int j=i-1;j>=0;j--){

              int x=Math.max(nums[j],num);
              int y=Math.min(nums[j],num);
              int num2=Math.min(x-y,y+24*60-x);
              min=Math.min(num2,min);
            }
        }
        return min;
    }
}