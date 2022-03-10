package leet29;

public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend==0){
            return 0;
        }
        if (divisor==1){
            return dividend;
        }
        int num=0;
        int max=0;



        if ((dividend>0&&divisor<0)||(dividend<0&&divisor>0)){


            if (dividend>0){

                while ((divisor>=(Integer.MIN_VALUE>>(max+1)))&&dividend+(divisor<<(max+1))>=0){
                    max++;

                }
                for (int i = max; i >=0 ; i--) {
                    if (dividend+(divisor<<i)>=0){
                        dividend+=(divisor<<i);
                        int next= (int) Math.pow(2,i);
                        if (num<Integer.MIN_VALUE+next){
                         return Integer.MAX_VALUE;
                        }
                        num-=next;
                    }
                }
            }else {
                divisor= -divisor;


                while (true){
                    if ((divisor < (Integer.MIN_VALUE >> (max + 1))) || dividend - (divisor << (max + 1)) > 0) break;
                    max++;

                }
                int i = max;
                while (i >=0) {
                    if (dividend - (divisor << i) <= 0) {
                        dividend -= (divisor << i);
                        int next = (int) Math.pow(2, i);
                        if (num > Integer.MAX_VALUE - next) {
                            return Integer.MAX_VALUE;
                        }
                        num += next;
                    }
                    i--;
                }
                num= -num;

            }
        }else {
            if (dividend>0){

                while ((divisor<=(Integer.MAX_VALUE>>(max+1)))&&dividend-(divisor<<(max+1))>=0){
                    max++;

                }
                for (int i = max; i >=0 ; i--) {
                    if (dividend-(divisor<<i)>=0){
                        dividend-=(divisor<<i);
                        int next= (int) Math.pow(2,i);
                        if (num>Integer.MAX_VALUE-next){
                            return Integer.MAX_VALUE;
                        }
                        num+=next;
                    }
                }
            }else {
                if (dividend==Integer.MIN_VALUE&&divisor==-1){
                    return Integer.MAX_VALUE;
                }
                while ((divisor>=(Integer.MIN_VALUE>>(max+1)))&&dividend-(divisor<<(max+1))<=0){
                    max++;

                }
                for (int i = max; i >=0 ; i--) {
                    if (dividend - (divisor << i) > 0) {
                        continue;
                    }
                    dividend-=(divisor<<i);
                    int next= (int) Math.pow(2,i);
                    if (num>Integer.MAX_VALUE-next){
                        return Integer.MAX_VALUE;
                    }
                    num+=next;
                }
            }
        }
        return num;
    }
}
