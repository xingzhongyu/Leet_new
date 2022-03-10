package leet647;

public class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        boolean[][] dp=new boolean[s.length()][s.length()];
        for (int i = 0; i < dp.length; i++) {
            dp[i][i]=true;
        }
        for (int i = s.length()-2; i >=0 ; i--) {
            for (int j = i+1; j <s.length() ; j++) {
                if (s.charAt(i)==s.charAt(j)){



                    dp[i][j]=dp[i+1][j-1]||((j-i)==1);
                }else {
                    dp[i][j]=false;
                }
            }
        }
        for (int i=0;i<dp.length;i++) {
            for (int j = i; j < s.length(); j++) {
                if (dp[i][j]) {
                    ans++;
                }
            }


        }
        return ans;
    }
}
