package leet553;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    T[][] memo;
    static class T {
        float min,max;
        String min_str,max_str;
    }
    public String optimalDivision(int[] nums) {

        memo=new T[nums.length][nums.length];
        T t=optimal(nums,0, nums.length-1);
        return t.max_str;

    }
    public T optimal(int[] nums,int start,int end){
        if (memo[start][end]!=null){
            return memo[start][end];
        }
        T t= new T();

        if (start==end){
            t.max=nums[start];
            t.min=nums[start];
            t.max_str=String.valueOf(nums[start]);
            t.min_str=String.valueOf(nums[start]);
            memo[start][end]=t;
            return t;
        }
        t.max=Float.MIN_VALUE;
        t.min=Float.MAX_VALUE;
        for (int i = start; i <end ; i++) {
            T t1=optimal(nums,start,i);
            T t2=optimal(nums,i+1,end);
            if (t.max<t1.max/t2.min){
                t.max=t1.max/t2.min;
                t.max_str=t1.max_str+"/"+(i+1!=end?"(":"")+t2.min_str+(i+1!=end?")":"");
            }
            if (t.min>t1.min/ t2.max){
                t.min=t1.min/t2.max;
                t.min_str=t1.min_str+"/"+(i+1!=end?"(":"")+t2.max_str+(i+1!=end?")":"");
            }
        }
        memo[start][end]=t;
        return t;
    }

}