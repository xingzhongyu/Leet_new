package leet290;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map=new HashMap<>();
        Map<String,Character> map1=new HashMap<>();

        String[] strings=s.split(" ");
        if (strings.length!=pattern.length()){
            return false;
        }
        for (int i = 0; i <pattern.length() ; i++) {
            char c=pattern.charAt(i);
            String s1=strings[i];



            if (!map.containsKey(c)&&!map1.containsKey(s1)){
                map.put(c,s1);
                map1.put(s1,c);
            }else if (map.containsKey(c)&&map1.containsKey(s1)){
                if (!(map.get(c).equals(s1)&&map1.get(s1)==c)){
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }
}
