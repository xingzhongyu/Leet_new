package leet456;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int max=Integer.MIN_VALUE;
        stack.push(nums[nums.length-1]);
        for (int i = nums.length-2; i >=0; i--) {

            if (nums[i]<max){
                return true;
            }
            while (!stack.isEmpty()&&nums[i]>stack.peek()){
                max=stack.pop();
            }
            if (nums[i]>max){
                stack.push(nums[i]);
            }
        }
        return false;
    }
}