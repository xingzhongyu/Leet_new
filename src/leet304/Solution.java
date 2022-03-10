package leet304;

import java.util.Arrays;

public class Solution {
    public void test(){
        NumMatrix numMatrix=new NumMatrix(new int[][]{{-4,-5}});
        System.out.println(numMatrix.sumRegion(0,0,0,1));
    }
}
class NumMatrix {
    int[][] matrix_pre;

    public NumMatrix(int[][] matrix) {


        matrix_pre=new int[matrix.length+1][matrix[0].length+1];
        for (int i = 0; i < matrix.length; i++) {
            matrix_pre[i][0]=0;
        }
        Arrays.fill(matrix_pre[0],0);
        for (int i = 1; i < matrix_pre.length; i++) {
            for (int j = 1; j < matrix_pre[0].length ; j++) {
                matrix_pre[i][j]=matrix_pre[i-1][j]+matrix_pre[i][j-1]-matrix_pre[i-1][j-1]+matrix[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return matrix_pre[row2+1][col2+1]-matrix_pre[row1][col2+1]-matrix_pre[row2+1][col1]+matrix_pre[row1][col1];
    }
}