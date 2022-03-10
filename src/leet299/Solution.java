package leet299;

public class Solution {
    public String getHint(String secret, String guess) {
        int ans=0;
        int ans2=0;
        int[] nums=new int[10];
        for (int i = 0; i <secret.length() ; i++) {
            nums[secret.charAt(i)-'0']++;
        }
        for (int i = 0; i <guess.length() ; i++) {
            int location=guess.charAt(i)-'0';
            if (nums[location]>0){
                nums[location]--;
                ans++;
            }
        }
        for (int i = 0; i <guess.length() ; i++) {
            if (guess.charAt(i)==secret.charAt(i)){
                ans--;
                ans2++;
            }
        }
        return ans+"A"+ans2+'B';
    }
}
