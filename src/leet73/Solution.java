package leet73;

import java.util.Arrays;

public class Solution {
    public void setZeroes(int[][] matrix) {
        int m= matrix.length;
        int n=matrix[0].length;
        boolean isRow=false;
        boolean isCol=false;

        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                isCol = true;
                break;
            }
        }
        for (int i = 0; i <n ; i++) {
            if (matrix[0][i]==0){
                isRow=true;
                break;
            }
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                    matrix[i][j]=1;
                }
            }
        }
        for (int i = 1; i < m ; i++) {
            if (matrix[i][0]==0){
                Arrays.fill(matrix[i],0);
            }
        }
        for (int i=1;i<n;i++){
            if (matrix[0][i]==0){
                for (int j = 1; j <m ; j++) {
                    matrix[j][i]=0;
                }
            }
        }
        if (isRow){
            Arrays.fill(matrix[0],0);
        }
        if (isCol){
            for (int i = 0; i <m ; i++) {
                matrix[i][0]=0;
            }
        }
    }
}
