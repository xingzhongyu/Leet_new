package leet551;

public class Solution {
    public boolean checkRecord(String s) {
        int a=0;
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if (c=='A'){
                a++;
                if (a>=2){
                    return false;
                }
            }
            if (i>=1&&s.charAt(i-1)=='L'&&i<(s.length()-1)&&s.charAt(i+1)=='L'&&s.charAt(i)=='L'){
                return false;


            }
        }
        return true;
    }
}
