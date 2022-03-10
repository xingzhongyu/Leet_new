package leet135;

public class Solution {
    public int candy(int[] ratings) {
        int sum=1;
        int num=1;
        int count=0;
        int inc=1;
        for (int i = 1; i < ratings.length ; i++) {
            if (ratings[i]>=ratings[i-1]){
                count=0;
                num=ratings[i]==ratings[i-1]?1:num+1;

                sum+=num;
                inc=num;
            }else {
                count++;
                if (count==inc){
                    count++;
                }
                sum+=count;
                num=1;
            }
        }

        return sum;
    }
}
