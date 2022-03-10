package leet479;

public class Solution {
    public int largestPalindrome(int n) {
        int largest= (int) (Math.pow(10,n)-1);
        long max= (long) Math.pow(largest,2);
        for (int i = largest-1; i >0 ; i--) {
            long num=getMirror(i);
            for (long ans = largest; num<=max&&ans*ans>=num ; ans--) {
                if (num%ans==0){




                    return (int) (num%1337);
                }
            }
        }
        return 9;
    }
    public long getMirror(int num){
        long ans=num,y=0;

        while (num>0){
            y=y*10+num%10;
            ans*=10;
            num/=10;
        }
        return ans+y;
    }
}
