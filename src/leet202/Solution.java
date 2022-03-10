package leet202;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        Set<Integer> set=new HashSet<>();
        while (n!=1){
            int temp=n;
            while (n>0){
                sum+=(n%10)*(n%10);
                n=n/10;
            }
            if (sum==temp||set.contains(sum)){
                return false;
            }
            set.add(sum);

            n=sum;

            sum=0;
        }
        return true;
    }
}
