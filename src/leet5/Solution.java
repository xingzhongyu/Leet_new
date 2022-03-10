package leet5;

public class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp=new boolean[s.length()][s.length()];
        int left=0, right=0,max=1;
        for (int i = 0; i <s.length() ; i++) {
            dp[i][i]=true;
        }
        for (int i = s.length()-1; i >=0 ; i--) {
            for (int j = i+1; j <=s.length()-1 ; j++) {
                if (s.charAt(i)==s.charAt(j)){

                    dp[i][j]=dp[i+1][j-1]||((j-i)==1);

                }else {
                    dp[i][j]=false;
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = i; j <s.length() ; j++) {
                if (dp[i][j]&&max<(j-i+1)){
                    max=j-i+1;
                    left=i;
                    right=j;
                }
            }
        }
        return s.substring(left,right+1);
    }
}
