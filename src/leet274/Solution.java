package leet274;

import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for (int i = citations.length-1; i >=0 ; i--) {
            int h=citations.length-i;
            if (h>citations[i]){
                return h-1;
            }

        }
        return citations.length;
    }
}
