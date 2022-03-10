package leet393;

public class Solution {
    public boolean validUtf8(int[] data) {
        int head=0;
        for (int datum : data) {
            if (head == 0) {
                boolean finish=true;
                for (int j = 7; j >= 0; j--) {
                    if ((datum & (1 << j)) > 0) {
                        head++;
                    } else {
                        finish=false;
                        break;
                    }
                }

                if (head == 1||finish||head>4) {
                    return false;
                }
                if (head>0){
                    head--;
                }
            } else {
                if ((datum & (1 << 7)) > 0 && (datum & (1 << 6)) == 0) {
                    head--;
                } else {
                    return false;
                }
            }
        }
        return head==0;
    }
}
