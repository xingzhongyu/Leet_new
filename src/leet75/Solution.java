package leet75;

public class Solution {
    public void sortColors(int[] nums) {
        int left=0,right=nums.length-1;
        for (int i = 0; i <=right ; i++) {
            if (nums[i]==0){
                swap(nums,left++,i);
            }
            if (nums[i]==2){
                swap(nums,right--,i);
                if (nums[i]!=1){

                    i--;
                }
            }
        }
    }


    public void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
