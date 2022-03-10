package leet56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        list.sort(Comparator.comparingInt(o -> o[0]));
        List<int[]> ans=new ArrayList<>();

        int[] before=null;
        int index=0;
        while (index<list.size()){
            if (before==null){
                before=list.get(index);
            }else {
                int[] nums= list.get(index);
                if (before[1]<nums[0]){
                    ans.add(before);
                    before=list.get(index);
                }else {
                    before[1]=Math.max(before[1],nums[1]);
                }
                index++;
            }
        }
        if (before!=null){
            ans.add(before);
        }
        int[][] a=new int[ans.size()][];
        for (int i = 0; i <a.length ; i++) {
            a[i]= ans.get(i);
        }
        return a;
    }
}
