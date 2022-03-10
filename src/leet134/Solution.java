package leet134;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n= gas.length;
        int start=0;
        while (start<n){
            int index=0;
            int sum1=0,sum2=0;
            while (index<n){
                sum1+=gas[(start+index)%n];
                sum2+=cost[(start+index)%n];

                if (sum1<sum2){
                    break;
                }
                index++;
            }
            if (index==n){
                return start;
            }else {
                start=start+index+1;
            }
        }
        return -1;


    }
}
