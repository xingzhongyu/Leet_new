package leet118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        lists.add(list);
        for (int i = 1; i <numRows ; i++) {
            List<Integer> list1=new ArrayList<>();
            list1.add(1);
            for (int j = 1; j <=i-1 ; j++) {
                List<Integer> list2=lists.get(i-1);
                list1.add(list2.get(j)+list2.get(j-1));

            }
            list1.add(1);
            lists.add(list1);
        }
        return lists;
    }
}
