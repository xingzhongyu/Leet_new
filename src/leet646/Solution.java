package leet646;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(o->o[0]));
        int ans=1;
        int right=pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (right<pairs[i][0]){

                ans++;
                right=pairs[i][1];
            }else {
                right=Math.min(right,pairs[i][1]);
            }
        }


        return ans;
    }
}