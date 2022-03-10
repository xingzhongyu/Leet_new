package leet343;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int integerBreak(int n) {
        List<Integer>[] lists=new List[n+1];
        if (n<3){
            return 1;
        }


        lists[1]=new ArrayList<>();
        lists[1].add(1);
        lists[2]=new ArrayList<>();
        lists[2].add(1);
        lists[2].add(1);
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=1;
        for (int i = 3; i <n+1 ; i++) {
            int min=lists[i-1].get(0);
            for (int num:lists[i-1]) {
                min=Math.min(min,num);
            }
            lists[i]=new ArrayList<>();
            lists[i-1].remove((Integer) min);
            lists[i].addAll(lists[i-1]);
            lists[i-1].add(min);
            if (min+1>dp[min+1]){
                lists[i].add(min+1);
                dp[i]=dp[i-1]/min*(min+1);
            }else {
                lists[i].addAll(lists[min+1]);
                dp[i]=dp[i-1]/min*dp[min+1];
            }
        }






        return dp[n];

    }
}