package leet41;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        int n= nums.length;
        int temp=1;
        boolean in=false;
        for (int num : nums) {
            if (num >= 1 && num <= n) {
                temp = num;
                in=true;
                break;
            }
        }
        if (!in){
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<=0||nums[i]>n){

                nums[i]=temp;//原地哈希
            }
        }

        for (int i = 0; i < nums.length ; i++) {
               int x=(nums[i]-1)%n;
              nums[x]+=n;
        }
        int min=n;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]<=n){
                min=Math.min(min,i+1);
            }
        }
        return min;
    }
}
