package leet345;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');

        set.add('u');
        int left=0;
        char[] chars=s.toCharArray();
        int right=chars.length-1;
        while (left<right){
            while (left<right&&!set.contains(Character.toLowerCase(chars[left]))){
                left++;
            }
            while (right>left&&!set.contains(Character.toLowerCase(chars[right]))){
                right--;
            }
            if (left>=right){
                break;
            }else {
                char c=chars[left];
                chars[left]=chars[right];
                chars[right]=c;
            }
            left++;
            right--;


        }
        StringBuilder stringBuilder=new StringBuilder();
        for (char c:chars){
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}