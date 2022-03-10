package leet414;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int thirdMax(int[] nums) {
        long INF= (long) -1e18;//看清数组范围

        long a=INF; long b=INF; long c=INF;
        for (int x : nums) {
            if (x > a) {
                c = b;
                b = a;
                a = x;
            } else if (x < a && x > b) {
                c = b;
                b = x;
            } else if (x < b && x > c) {
                c = x;
            }
        }
        return (int) (c==INF?a:c);



    }
}
