package leet598;

public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0){
            return m*n;
        }
        int min0=ops[0][0];
        int min1=ops[0][1];
        for (int[] op : ops) {
            min0 = Math.min(min0, op[0]);
            min1 = Math.min(min1, op[1]);
        }

        return min0*min1;
    }
}
