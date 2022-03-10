package leet649;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Solution {
    public String predictPartyVictory(String senate) {
        TreeSet<Integer> RList=new TreeSet<>();
        TreeSet<Integer> DList=new TreeSet<>();
        char[] chars=senate.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]=='R'){

                RList.add(i);
            }else {
                DList.add(i);
            }
        }
       while (!RList.isEmpty()&&!DList.isEmpty()){
           for (int i = 0; i < chars.length; i++) {
               if (chars[i]=='R'){
                   Integer location=DList.ceiling(i+1);
                   if (location==null){
                       location= DList.pollFirst();
                   }
                   DList.remove(location);

                   if (DList.isEmpty()){
                       return "Radiant";
                   }
                    chars[location]=0;
               }else if (chars[i]=='D'){
                    Integer location=RList.ceiling(i+1);
                    if (location==null){
                        location=RList.pollFirst();
                    }
                   RList.remove(location);

                   if (RList.isEmpty()){

                        return "Dire";
                    }
                    chars[location]=0;
               }
           }
       }
       if (RList.isEmpty()){
           return "Dire";
       }else {
           return "Radiant";
       }

    }


}
