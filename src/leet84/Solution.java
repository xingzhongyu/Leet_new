package leet84;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack=new ArrayDeque<>();
        int n=heights.length;
        int[] left=new int[n];
        int[] right=new int[n];

        Arrays.fill(right,n);
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty()&&heights[stack.peek()]>=heights[i]){
                right[stack.pop()]=i;
            }
            left[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        int ans=0;
        for (int i = 0; i <n ; i++) {
            ans=Math.max(ans,(right[i]-left[i]-1)*heights[i]);
        }
        return ans;
    }
}