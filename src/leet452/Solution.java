package leet452;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));
        int right=points[0][1];


        int ans=1;
        for (int i = 1; i < points.length ; i++) {
           if (points[i][0]>right){
               ans++;
               right=points[i][1];
           }else {
                right=Math.min(right,points[i][1]);
           }
        }

        return ans;
    }
}