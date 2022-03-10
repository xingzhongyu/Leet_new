package leet85;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int ans=0;
        int[] heights=new int[col];

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if (matrix[i][j]=='0'){
                    heights[j]=0;
                }else {

                    heights[j]++;
                }

            }

            int[] left=new int[col];
            int[] right=new int[col];
            Arrays.fill(right,col);
            Deque<Integer> stack=new ArrayDeque<>();
            for (int j = 0; j < col; j++) {
                int num=heights[j];
                while (!stack.isEmpty()&&heights[stack.peek()]>=num){
                    right[stack.pop()]=j;
                }
                left[j]=stack.isEmpty()?-1:stack.peek();
                stack.push(j);

            }
            for (int j = 0; j <col ; j++) {
                ans=Math.max(ans,(right[j]-left[j]-1)*heights[j]);
            }
        }
        return ans;
    }

}
