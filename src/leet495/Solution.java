package leet495;

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans=0;
        for (int i = 0; i < timeSeries.length; ) {
            int time=timeSeries[i];
            int finalTime=time+duration-1;
            int j=i+1;
            while (j<timeSeries.length&&timeSeries[j]<=finalTime){
                j++;
                finalTime=timeSeries[j-1]+duration-1;

            }


            i=j;
            ans+=finalTime-time+1;
        }
        return ans;
    }
}