package leet581;

import java.util.Stack;

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start=-1,end=-1;
        Stack<Integer> stack=new Stack<>();
        stack.add(nums[0]);
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i]>=stack.peek()){
                stack.push(nums[i]);

            }else {
                int count=1;
                stack.pop();
                while (!stack.isEmpty()&&nums[i]<stack.peek()){
                    count++;
                    stack.pop();
                }
                start=i-count;
                break;
            }
        }
        Stack<Integer> stack1=new Stack<>();
        stack1.add(nums[nums.length-1]);
        for (int i = nums.length-2; i >=0 ; i--) {
            if (nums[i]<=stack1.peek()){
                stack1.push(nums[i]);
            }else {
                int count=1;
                stack1.pop();
                while (!stack1.isEmpty()&&nums[i]>stack1.peek()){
                    count++;
                    stack1.pop();
                }
                end=i+count;
                break;
            }
        }

        if (end==start){
            return 0;

        }else {
            int max=nums[start];
            int min=nums[start];
            for (int i = start; i <=end ; i++) {
                max=Math.max(max,nums[i]);
                min=Math.min(min,nums[i]);
            }
            while (!stack.isEmpty()&&min<stack.peek()){
                stack.pop();
                start--;
            }
            while (!stack1.isEmpty()&&max>stack1.peek()){
                stack1.pop();
                end++;
            }
            return end-start+1;
        }
    }
}