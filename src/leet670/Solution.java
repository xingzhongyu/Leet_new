package leet670;

public class Solution {
    public int maximumSwap(int num) {
        StringBuilder stringBuilder=new StringBuilder(String.valueOf(num));
        int[] nums=new int[stringBuilder.length()];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (stringBuilder.charAt(i)<stringBuilder.charAt(j)){
                    nums[i]++;
                }
                if (stringBuilder.charAt(i)>stringBuilder.charAt(j)){



                    nums[j]++;
                }
            }
        }
        for (int i = 0; i <=nums.length-1 ; i++) {
            if (nums[i]>i){
                int max=i;
                for (int j = max; j <stringBuilder.length() ; j++) {
                    if (stringBuilder.charAt(max)<=stringBuilder.charAt(j)){
                        max=j;
                    }
                }
                String temp=String.valueOf(stringBuilder.charAt(i));
                stringBuilder.replace(i,i+1,String.valueOf(stringBuilder.charAt(max)));
                stringBuilder.replace(max,max+1,temp);
                return Integer.parseInt(stringBuilder.toString());

            }
        }
        return num;
    }
}
