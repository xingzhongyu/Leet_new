package leet228;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start=0;
        List<String> strings=new ArrayList<>();
        if (nums.length==0){
            return strings;


        }
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i]-nums[i-1]!=1){
                if (start==i-1){
                    strings.add(String.valueOf(nums[start]));

                }else {
                    strings.add(nums[start]+"->"+nums[i-1]);
                }
                start=i;
            }
        }
        if (start== nums.length-1){
            strings.add(String.valueOf(nums[start]));
        }else {
            strings.add(nums[start]+"->"+nums[nums.length-1]);

        }
        return strings;
    }
}