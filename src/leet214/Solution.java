package leet214;

public class Solution {
    public String shortestPalindrome(String s) {
       int n=s.length();
       int left=0;
       int right=0;
       int best=-1;
       int mul=1;
       int base=131,mod=1000000007;
        for (int i = 0; i <n ; i++) {
            left=(int)(((long)left*base+s.charAt(i))%mod);
            right=(int) ((right+(long)mul*s.charAt(i))%mod);
            if (left==right){
                best=i;
            }
            mul=(int) ((long)mul*base%mod);
        }
        String add=(best==n-1?"":s.substring(best+1));
        StringBuilder stringBuilder=new StringBuilder(add).reverse();
        stringBuilder.append(s);
        return stringBuilder.toString();
    }
}
