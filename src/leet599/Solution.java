package leet599;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int index1=0, index2;
        int min= list1.length+list2.length-2;
        List<String> list=new ArrayList<>();
        while (index1<list1.length){
            if ((min-index1< list2.length)&&list2[min-index1].equals(list1[index1])){



                list.add(list1[index1]);
            }
            index2=0;
           while (index2< list2.length&&index1+index2<min){
               if (list1[index1].equals(list2[index2])){
                   list.clear();
                   list.add(list1[index1]);
                   min=index1+index2;
                   break;
               }
               index2++;
           }
            index1++;
            if (min<index1){
                break;
            }

        }

        return list.toArray(new String[0]);
    }
}