package leet14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        for (int i = 1; i <strs.length ; i++) {
            int j=0;
            for (; j <Math.min(s.length(),strs[i].length()) ; j++) {
                if (s.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }

            s=s.substring(0,j);
        }
        return s;
    }
}
