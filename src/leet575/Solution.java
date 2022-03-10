package leet575;

import java.util.Arrays;

public class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int kind=0;
        for (int i = 0; i < candyType.length; i++) {
            if (i==0||(candyType[i]!=candyType[i-1])){
                kind++;


                if (kind>candyType.length/2){
                    return candyType.length/2;
                }
            }
        }
        return kind;
    }
}