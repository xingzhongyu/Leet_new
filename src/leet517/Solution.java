package leet517;

import java.util.Arrays;

public class Solution {
    public int findMinMoves(int[] machines) {
        int total= Arrays.stream(machines).sum();
        int n= machines.length;
        if (total%n!=0){
            return -1;
        }
        int avg=total/n;

        int ans=0,sum=0;
        for (int i = 0; i <machines.length ; i++) {
            int num=machines[i]-avg;
            sum+=num;
            ans=Math.max(ans,Math.max(Math.abs(sum),num));
        }
        return ans;
    }
}