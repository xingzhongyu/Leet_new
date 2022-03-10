package leet459;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 0; i <s.length()/2 ; i++) {
            String temp=s.substring(0,i+1);
            if (temp.repeat(s.length()/(i+1)).equals(s)){
                return true;
            }
        }
        return false;


    }
}