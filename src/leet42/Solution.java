package leet42;

public class Solution {
    public int trap(int[] height) {
        int left=0;
        int right= height.length-1;
        int leftMax,rightMax;
        int ans=0;
        while (left<right){
            if (height[left]>height[right]){
                rightMax=height[right];
                while (left<right&&height[right]<=rightMax){

                    ans+=(rightMax-height[right]);
                    right--;
                }
            }else {
                leftMax=height[left];
                while (left<right&&height[left]<=leftMax){
                    ans+=(leftMax-height[left]);
                    left++;
                }
            }
        }
        return ans;
    }
}