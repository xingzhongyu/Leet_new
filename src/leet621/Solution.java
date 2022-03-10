package leet621;

import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        int ans=0;
        int[] nums=new int[26];
        int max=0;

        for (int i = 0; i < tasks.length ; i++) {

            nums[tasks[i]-'A']++;
            max=Math.max(max,nums[tasks[i]-'A']);
        }
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]==max){
                ans++;
            }
        }
        ans+=(max-1)*(n+1);
        return Math.max(ans,tasks.length);
    }
}
