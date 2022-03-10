package leet476;

public class Solution {
    public int findComplement(int num) {
        int h=0;
        for (int i = 0; i <=30 ; i++) {
            if (num>=(1<<i)){
                h=i;
            }else {
                break;
            }
        }


        return num^(h==30?0x7fffffff:(1<<h+1)-1);
    }
}
