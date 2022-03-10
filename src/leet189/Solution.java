package leet189;

public class Solution {
    public void rotate(int[] nums, int k) {
        k=k% nums.length;
        int[] nums2=new int[k];
        System.arraycopy(nums,nums.length-k,nums2,0,k);
        System.arraycopy(nums,0,nums,k,nums.length-k);
        System.arraycopy(nums2,0,nums,0,k);

    }
}