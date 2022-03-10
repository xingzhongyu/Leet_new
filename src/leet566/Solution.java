package leet566;

public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] ans=new int[r][c];
        if (m*n!=r*c){
            return mat;
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {

                int count=i*n +j;

                ans[count/c][count%c]=mat[i][j];

            }
        }
        return ans;
    }
}