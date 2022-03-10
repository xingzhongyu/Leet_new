package leet125;

import java.util.Locale;

public class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();

        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if (('a'<=c&&c<='z')||('A'<=c&&c<='Z')||'0'<=c&&c<='9'){
                stringBuilder.append(c);

            }
        }
       String s1=stringBuilder.toString();
        String s2=stringBuilder.reverse().toString();

        return s1.equals(s2);

    }
}

