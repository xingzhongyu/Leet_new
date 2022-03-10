package leet13;

public class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        char[] chars = s.toCharArray();

        int i = chars.length - 1;
        while (i >= 0) {
            char c = chars[i];
            if (c == 'V' || c == 'X') {
                if (i >= 1 && chars[i - 1] == 'I') {
                    ans = ans + toInt(c) - 1;
                    i--;
                } else {
                    ans = ans + toInt(c);
                }
            } else if (c == 'L' || c == 'C') {
                if (i >= 1 && chars[i - 1] == 'X') {
                    ans = ans + toInt(c) - 10;
                    i--;
                } else {
                    ans = ans + toInt(c);
                }
            } else if (c == 'D' || c == 'M') {
                if (i >= 1 && chars[i - 1] == 'C') {
                    ans = ans + toInt(c) - 100;
                    i--;
                } else {
                    ans = ans + toInt(c);
                }
            } else if (c == 'I') {
                ans++;
            }


            i--;
        }
        return ans;
    }

    public int toInt(char c) {
        /*
        I             1
V             5
X             10
L             50
C             100
D             500
M             1000





         */
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };


    }
}


