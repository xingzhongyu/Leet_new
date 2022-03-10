package leet524;

import java.util.List;

public class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        int[][] dp=new int[s.length()+1][26];
        for (int i = 0; i <26 ; i++) {
            dp[s.length()][i]=s.length();
        }
        for (int i = s.length()-1; i >=0 ; i--) {
            for (int j = 0; j <26 ; j++) {

                if (s.charAt(i)-'a'==j){
                    dp[i][j]=i;
                }else {
                    dp[i][j]=dp[i+1][j];
                }
            }
        }
        String ans="";
        for (String s1:dictionary) {
            int index=0;
            boolean in=true;
                for (int i = 0; i <s1.length() ; i++) {
                    if (index>=s.length()){
                        in=false;
                        break;
                    }






                    index=dp[index][s1.charAt(i)-'a']+1;


                }
                if (index>s.length()){
                    in=false;
                }

            if (in){
                if ("".equals(ans)||ans.length()<s1.length()){
                    ans=s1;
                }else if (ans.length()==s1.length()){
                    if (ans.compareTo(s1)>0){
                        ans=s1;
                    }
                }
            }
        }
        return ans;
    }
}
