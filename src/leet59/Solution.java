package leet59;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];//为确保矩阵也可使用，以矩阵方法对待
        int top=0;
        int bottom=ans.length-1;
        int left=0;
        int right=ans[0].length-1;
        int count=ans.length*ans[0].length;
        while (count>=1){
            for (int i = left; i <=right ; i++) {
                ans[top][i]=ans.length*ans[0].length-count+1;
                count--;
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                ans[i][right]=ans.length*ans[0].length-count+1;
                count--;
            }
            right--;
            for (int i = right; i >=left ; i--) {
                ans[bottom][i]=ans.length*ans[0].length-count+1;
                count--;
            }
            bottom--;
            for (int i = bottom; i >=top ; i--) {
                ans[i][left]=ans.length*ans[0].length-count+1;
                count--;
            }
            left++;
        }
        return ans;
    }
}
