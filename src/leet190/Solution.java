package leet190;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String s=Integer.toBinaryString(n);
        StringBuilder stringBuilder=new StringBuilder(s);
        if (stringBuilder.length()<32){
            stringBuilder.insert(0,"0".repeat(32-stringBuilder.length()));
        }
        return (int) Long.parseLong(stringBuilder.reverse().toString(),2);
    }





}
