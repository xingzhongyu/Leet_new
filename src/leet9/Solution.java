package leet9;

public class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        if (x<0){
            return false;
        }
        long y=0;
        while (temp>0){
            y=y*10+temp%10;
            temp/=10;


        }


        return x==y;
    }
}