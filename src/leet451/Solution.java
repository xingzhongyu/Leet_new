package leet451;

import java.util.*;

public class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }

        }
        StringBuilder stringBuilder=new StringBuilder();
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        for (Map.Entry<Character, Integer> entry : list) {

            stringBuilder.append(String.valueOf(entry.getKey()).repeat(Math.max(0, entry.getValue())));

        }






        return stringBuilder.toString();
    }
}
