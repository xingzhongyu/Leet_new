package leet503;

import java.util.*;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        int[] ans=new int[nums.length];
        Arrays.fill(ans,-1);
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i <2*n-1 ; i++) {
            while (!stack.isEmpty()&&nums[stack.peek()]<nums[i%n]){

                ans[stack.pop()]=nums[i%n];
            }
            stack.push(i%n);
        }
        return ans;
    }
}