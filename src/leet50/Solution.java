package leet50;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public double myPow(double x, int n) {
        boolean isNa=false;
        boolean M=false;
        if (n<0){
            isNa=true;
            if (n==Integer.MIN_VALUE){



                n=n/2;
                M=true;
            }
            n=-n;

        }
        if (n==0){
            return 1;
        }
        double ans=1;
        List<Double> list=new ArrayList<>();
        int index=1;
        list.add(x);
        while (index<=(n>>1)){
            double num=list.get(list.size()-1);
            list.add(num*num);
            index<<=1;
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            if (n>=(1<<i)){
                n-=(1<<i);
                ans*=list.get(i);

            }

        }
        if (isNa){
            if (M){
                ans*=ans;
            }
            ans=1/ans;
        }
        return ans;
    }
}
