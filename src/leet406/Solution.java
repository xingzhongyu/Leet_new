package leet406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, Comparator.comparingInt(o->o[0]));
        int[][] ans=new int[people.length][];
        for (int i = 0; i < people.length ; i++) {

            int index=0;
            int count=people[i][1];
           while (count>0&&index< ans.length){
               if (ans[index]==null||ans[index][0]==people[i][0]){
                   count--;
               }
               index++;
           }
           while (index< ans.length){
               if (ans[index]==null){
                   ans[index]=people[i];
                   break;
               }
               index++;
           }
        }
        return ans;
    }
}
