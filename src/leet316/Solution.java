package leet316;

public class Solution {
    public String removeDuplicateLetters(String s) {
        boolean[] vis=new boolean[26];
        int[] nums=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            nums[s.charAt(i)-'a']++;
        }
        StringBuilder ans=new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);

            if (!vis[c-'a']){
                while (!ans.isEmpty()&&ans.charAt(ans.length()-1)>c){
                    char c1=ans.charAt(ans.length()-1);
                    if (nums[c1-'a']>0){
                        vis[c1-'a']=false;
                        ans.deleteCharAt(ans.length()-1);
                    }else {
                        break;
                    }
                }
                vis[c-'a']=true;
                ans.append(c);

            }
            nums[c-'a']--;

        }
        return ans.toString();
    }
}
