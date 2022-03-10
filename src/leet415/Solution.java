package leet415;

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder=new StringBuilder();
        int n=Math.max(num1.length(),num2.length());
        int carry=0;
        for (int i = 0; i <n ; i++) {
            int x=(num1.length()-i-1)>=0?(num1.charAt(num1.length()-i-1)-'0'):0;
            int y=(num2.length()-i-1)>=0?(num2.charAt(num2.length()-i-1)-'0'):0;
            carry+=(x+y);
            stringBuilder.append(carry%10);

            carry/=10;
        }
        if (carry>0){
            stringBuilder.append(carry);
        }
        return stringBuilder.reverse().toString();
    }
}
