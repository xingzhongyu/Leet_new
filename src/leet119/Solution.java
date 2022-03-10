package leet119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        if (rowIndex==0){
            list.add(1);
            return list;
        }

        List<Integer> oldList;
        oldList=list;

        for (int i = 1; i <= rowIndex; i++) {
            list=new ArrayList<>();
            list.add(1);
            for (int j = 1; j <=i-1 ; j++) {
                list.add(oldList.get(j)+oldList.get(j-1));
            }
            list.add(1);
            oldList=list;
        }
        return list;
    }
}
