package leet467;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int findSubstringInWraproundString(String p) {
        int[] nums=new int[26];
        int i=0;
        int count=0;
        while (i<p.length()){

            char c=p.charAt(i);
           if (i>0){


               char before=p.charAt(i-1);
               if (c-before==1||before-c==25){
                   count++;
               }else {
                   count=1;
               }
           }else {
               count=1;
           }
           nums[c-'a']=Math.max(nums[c-'a'],count);
           i++;
        }
//        int t=stringSet.size();
        int ans=0;
        for (int num:nums){
           ans+=num;
        }

        return ans;
    }
}










