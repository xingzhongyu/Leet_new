package leet500;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public String[] findWords(String[] words) {
        String[] strings=new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
        List<String> list=new ArrayList<>();
        up:for (String s:words){

            String temp=s;
            s=s.toLowerCase();
            String in=strings[0];
            for (String s1:strings){
                if (s1.indexOf(s.charAt(0))!=-1){
                    in=s1;
                    break;
                }
            }
            for (int i = 1; i < s.length(); i++) {
                if (in.indexOf(s.charAt(i))==-1){
                    continue up;
                }
            }
            list.add(temp);
        }
        return list.toArray(new String[0]);
    }
}
