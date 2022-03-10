package leet387;

public class Solution {
    public int firstUniqChar(String s) {
        char[] chars=s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c=chars[i];
            boolean unique=true;
            for (int j = 0; j <chars.length ; j++) {
                if (i!=j&&chars[j]==c){
                    unique=false;
                    break;
                }
            }
            if (unique){
                return i;
            }
        }
        return -1;
    }
}