package leet66;

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i]<9){
                digits[i]++;
                break;
            }
            digits[i]=0;
        }
        if (digits[0]==0){

            int[] ans=new int[digits.length+1];
            ans[0]=1;
            System.arraycopy(digits,0,ans,1,digits.length);
            return ans;

        }

        return digits;
    }
}
