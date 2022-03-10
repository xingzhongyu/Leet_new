package leet498;

public class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        boolean ini = true;
        int m=mat.length;
        int n=mat[0].length;
        int count= m*n;//寻找元素的坐标的规律
        int[] ans=new int[count];
        int i=0;
        int j=0;
        while (count>=1){
            if (ini){
                if (i>=0&&j<n){
                    ans[m*n-count]=mat[i][j];
                    i--;
                    j++;
                    count--;
                }else {
                   if (j<n){
                       i=i+1;

                   }else {
                       i=i+2;
                       j=j-1;
                   }
                    ini=false;
                }
            }else {
                if(j>=0&&i<m){
                    ans[m*n-count]=mat[i][j];
                    i++;
                    j--;
                    count--;
                }else {
                    if(i<m){
                        j=j+1;
                    }else {
                        i=i-1;
                        j=j+2;

                    }
                    ini=true;
                }
            }
        }
        return ans;
    }
}
