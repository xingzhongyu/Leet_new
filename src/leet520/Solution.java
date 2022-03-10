package leet520;

public class Solution {
    public boolean detectCapitalUse(String word) {
        char[] ans=word.toCharArray();
        if ('A'<=ans[0]&&ans[0]<='Z'){
            for (int i = 1; i <word.length()-1 ; i++) {
                if (('a'<=ans[i]&&ans[i]<='z'&&'A'<=ans[i+1]&&ans[i+1]<='Z')){
                    return false;
                }
                if('a'<=ans[i+1]&&ans[i+1]<='z'&&'A'<=ans[i]&&ans[i]<='Z'){
                    return false;
                }

            }

        }else {
            for (int i = 1; i <ans.length ; i++) {
                if ('A'<=ans[i]&&ans[i]<='Z'){
                    return false;
                }
            }
        }
        return true;
    }
}