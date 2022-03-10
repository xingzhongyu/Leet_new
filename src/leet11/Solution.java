package leet11;

public class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftMin,rightMin;
        int ans=0;
        while (left<right){
            if (height[left]>height[right]){
                ans=Math.max(ans,(right-left)*height[right]);
                rightMin=height[right];

                while (right>left&&height[right]<=rightMin){
                    right--;
                }
            }else if (height[left]<=height[right]){
                ans=Math.max(ans,(right-left)*height[left]);
                leftMin=height[left];
                while (left<right&&height[left]<=leftMin){
                    left++;
                }
            }
        }
        return ans;

    }
}