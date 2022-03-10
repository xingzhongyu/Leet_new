package leet657;

public class Solution {
    public boolean judgeCircle(String moves) {
        int[] ans=new int[2];
        for (int i=0;i<moves.length();i++){
            char c=moves.charAt(i);
            switch (c) {
                case 'R' -> ans[0]++;
                case 'L' -> ans[0]--;
                case 'U' -> ans[1]++;
                case 'D' -> ans[1]--;
            }

        }






        return ans[0]==0&&ans[1]==0;
    }
}