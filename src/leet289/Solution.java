package leet289;

public class Solution {
    public void gameOfLife(int[][] board) {
        int toD=-1;
        int toL=2;
        int m= board.length;
        int n= board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int neighbor=0;
                for (int k = -1; k <=1 ; k++) {
                    for (int l = -1; l <=1 ; l++) {

                        if (i+k>=0&&i+k<m&&j+l>=0&&j+l<n){

                            if (board[i+k][j+l]==1||board[i+k][j+l]==toD){
                               neighbor++;
                            }
                        }
                    }

                }
                if (board[i][j]==1&&(neighbor<2||neighbor>3)){
                    board[i][j]=toD;
                }
                if (board[i][j]==0&&(neighbor==3)){
                    board[i][j]=toL;
                }

            }
        }
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n ; j++) {
                if (board[i][j]==toD){
                    board[i][j]=0;
                }
                if (board[i][j]==toL){
                    board[i][j]=1;


                }
            }
        }
    }
}
