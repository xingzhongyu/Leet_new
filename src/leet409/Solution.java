package leet409;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int sum=0;

        for (int i: map.values()){
            if (i>1){
                sum+=(i-i%2);
            }
        }
        if (sum<s.length()){
            sum++;
        }
        return sum;
    }
}