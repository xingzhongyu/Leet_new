package leet58;

public class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        char[] chars=s.toCharArray();
        int i = chars.length-1;
        for (; i >=0;  i--) {
            if (chars[i]==' '){
                break;
            }
        }


        return  chars.length-i-1;

    }
}
