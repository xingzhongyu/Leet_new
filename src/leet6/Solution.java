package leet6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1){
            return s;
        }
        List<StringBuilder> list=new ArrayList<>();
        for (int i = 0; i <numRows ; i++) {
            list.add(new StringBuilder());
        }
       int x=0;


       boolean up=true;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            list.get(x).append(c);
            if (x==numRows-1||x==0){
                up=!up;
            }
            x+=up?-1:1;
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (StringBuilder stringBuilder1:list){
            stringBuilder.append(stringBuilder1);
        }
        return stringBuilder.toString();
    }
}