package leet389;

public class Solution {
    public char findTheDifference(String s, String t) {
        int[] ans=new int[26];
        char[] chars=s.toCharArray();
        for (char c : chars) {
            ans[c - 'a']++;
        }
        char[] chars1=t.toCharArray();
        for (char c : chars1) {
            ans[c - 'a']--;
            if (ans[c - 'a'] < 0) {
                return c;
            }
        }




        return 'a';
    }
}
