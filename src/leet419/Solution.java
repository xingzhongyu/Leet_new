package leet419;

public class Solution {
    public int countBattleships(char[][] board) {
        int count=0;
        char aim='X';
        if (board[0][0]==aim){
            count++;
        }
        for (int i = 1; i <board[0].length ; i++) {
            if (board[0][i]==aim&&board[0][i-1]!=aim){
                count++;
            }
        }
        for (int i = 1; i < board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                if (board[i][j]==aim){


                    if ((j==0||board[i][j-1]!=aim)&&(board[i-1][j]!=aim)){
                        count++;
                    }


                }

            }
        }
        return count;
    }
}
