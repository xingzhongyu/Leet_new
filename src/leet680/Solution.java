package leet680;

public class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        boolean f=true;
        while (left<right){
            if (s.charAt(left)!=s.charAt(right)){
                break;
            }
            left++;


            right--;
        }
        if (left>=right){
            return true;
        }
        int start=left;
        int end=right;
        start++;
        while (start<end){
            if (s.charAt(start)!=s.charAt(end)){
                break;
            }
            start++;
            end--;
        }
        if (start>=end){
            return true;
        }
        start=left;
        end=right;
        end--;
        while (start<end){
            if (s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}