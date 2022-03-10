package leet636;

import java.util.List;
import java.util.Stack;

public class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] nums=new int[n];
        Stack<Activity> stack=new Stack<>();
        for (int i = 0; i <logs.size() ; i++) {
            String log=logs.get(i);
            int index1=log.indexOf(':');



            int index2= log.lastIndexOf(':');
            int num=Integer.parseInt(log.substring(0,index1));
            boolean isStart=log.substring(index1+1,index2).equals("start");
            int time=Integer.parseInt(log.substring(index2+1));
            if (isStart){
                stack.push(new Activity(num, time));
            }else {
                Activity activity=stack.pop();
                int totalTime=time-activity.startTime+1;
                nums[num]+=(totalTime-activity.stopTime);
                if (!stack.isEmpty()){
                    stack.peek().stopTime+=totalTime;
                }

            }
        }
        return nums;
    }
    static class Activity{
        int num;
        int startTime;
        int stopTime;
        public Activity(int num, int start) {
            this.num = num;
            this.startTime = start;
        }
    }
}