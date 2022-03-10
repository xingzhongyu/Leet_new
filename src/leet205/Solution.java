package leet205;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        Map<Character,Character> map1=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            char c1=t.charAt(i);



            if (map.containsKey(c)&&c1!=map.get(c)){
                return false;
            }
            if (map1.containsKey(c1)&&c!=map1.get(c1)){
                return false;
            }
            map.put(c,c1);
            map1.put(c1,c);
        }
        return true;
    }
}
