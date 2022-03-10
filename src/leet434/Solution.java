package leet434;

public class Solution {
    public int countSegments(String s) {
        int num=0;
        char[] ans=s.toCharArray();
        for (int i = 0; i < ans.length-1 ; i++) {
            if (ans[i]!=' '&&ans[i+1]==' '){
                num++;
            }
        }
        if (ans[ans.length-1]!=' '){
            num++;
        }
        return num;
    }
}