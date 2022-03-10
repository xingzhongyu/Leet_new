package leet54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int k=0;

        int count=matrix.length*matrix[0].length;
        List<Integer> ans=new ArrayList<>();
        while (count>0){
            for (int j = k; j < matrix[0].length-k ; j++) {
                ans.add(matrix[k][j]);

                count--;
            }
            if (count==0){
                break;
            }
            for (int i = k+1; i < matrix.length-k; i++) {
                ans.add(matrix[i][matrix[0].length-k-1]);
                count--;

            }
            if (count==0){
                break;
            }
            for (int j=matrix[0].length-k-2;j>=k;j--){
                ans.add(matrix[matrix.length-k-1][j]);
                count--;
            }
            if (count==0){
                break;
            }
            for (int i= matrix.length-k-2;i>k;i--){
                ans.add(matrix[i][k]);
                count--;
            }
            if (count==0){
                break;
            }
            k++;


        }

        return ans;

    }
}
