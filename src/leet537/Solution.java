package leet537;

public class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int[] nums=new int[4];
        String[] strings;
        strings=num1.split("\\+");
        nums[0]=Integer.parseInt(strings[0]);
        nums[1]=Integer.parseInt(strings[1].substring(0,strings[1].length()-1));
        strings=num2.split("\\+");
        nums[2]=Integer.parseInt(strings[0]);
        nums[3]=Integer.parseInt(strings[1].substring(0,strings[1].length()-1));

        return (nums[0]*nums[2]-nums[1]*nums[3])+"+"+(nums[0]*nums[3]+nums[2]*nums[1])+"i";

    }
}
