package leet455;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0;
        int j=0;
        while (ans<g.length&&j<s.length){
            if (g[ans]<=s[j]){

            ans++;
            }
            j++;
        }
        return ans;
    }
}
