package leet172;

import java.awt.color.ICC_ColorSpace;

public class Solution {
    public int trailingZeroes(int n) {
        if (n==0){
            return 0;
        }
        int ans=0;
        while (n>1) {
            n/=5;



            ans+=n;
        }
        return ans;
    }
}

