package leet283;

public class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int location=i;
            if (nums[i]==0){
                while (location< nums.length&&nums[location]==0){
                    location++;
                }
                if (location< nums.length){



                    nums[i]=nums[location];
                    nums[location]=0;

                }
            }

        }
    }
}
