package leet481;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int magicalString(int n) {
        int write=0;
        int read=0;
        int ans=0;
        List<Integer> list=new ArrayList<>();
        list.add(1);

       while (write<n){
            if (list.get(read)==1){
                if (list.get(write)==2){
                    list.add(1);
                    list.add(2);
                    read+=2;
                }else if (list.get(write)==1){
                    list.add(2);
                    read+=1;
                }
            }else if (list.get(read)==2){
               if (list.get(write)==2){
                   list.add(2);
                   list.add(1);
                   read+=2;
               }else if (list.get(write)==1){
                   list.add(1);
                   read+=1;
               }
            }
            write++;
        }
        for (int i = 0; i < n; i++) {
            if (list.get(i)==1){
                ans++;
            }
        }
        return ans;



    }
}
