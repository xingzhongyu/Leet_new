package leet696;

public class Solution {
    public int countBinarySubstrings(String s) {
        int x=0;
        int y=0;
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if (c=='0'){
                if (i>=1&&s.charAt(i-1)=='1'){
                    x=0;

                }
                x++;

                if (y>=x){

                    count++;
                }
            }
            if (c=='1'){
                if (i>=1&&s.charAt(i-1)=='0'){
                    y=0;

                }
                y++;
                if (x>=y){
                    count++;
                }
            }
        }
        return count;
    }
}
