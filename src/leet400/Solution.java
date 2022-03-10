package leet400;

public class Solution {
    public int findNthDigit(int n){
     int d=1,count=9;
     while (n>(long)d*count){
         n-=(d*count);
         d++;
         count*=10;
     }
     int index=n-1;
     int start= (int) Math.pow(10,d-1);



     int num=start+index/d;
     int index1=index%d;
     return (int) ((num/Math.pow(10,d-index1-1))%10);


    }
}
