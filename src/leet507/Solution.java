package leet507;

public class Solution {
    public boolean checkPerfectNumber(int num) {
        int ans=1;
        if (num==1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if (num%i==0){
                ans+=i;
                if (i!=Math.sqrt(num)){




                    ans+=(num/i);
                }
                if (ans>num){
                    return false;
                }
            }
        }
        return ans==num;
    }
}