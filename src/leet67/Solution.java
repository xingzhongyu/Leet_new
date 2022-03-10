package leet67;

import java.math.BigDecimal;

public class Solution {
    public String addBinary(String a, String b) {
        int next=0;
        StringBuilder stringBuilder=new StringBuilder();
        if (b.length()>a.length()){
            String temp=a;
            a=b;
            b=temp;

        }



        for (int i = b.length()-1;i >=0 ; i--) {
            int x=a.charAt(i+a.length()-b.length())-'0';
            int y=b.charAt(i)-'0';

            if (x==y&&next==0){
                stringBuilder.append('0');
            }else if (x!=y&&next==1){
                stringBuilder.append('0');
            }else {
                stringBuilder.append('1');
            }
            if (x==0&&y==0||x==0&&next==0||y==0&&next==0){
                next=0;
            }else {
                next=1;
            }

        }
        stringBuilder.reverse();
        if (next==0){
            stringBuilder.insert(0,a.substring(0,a.length()-b.length()));
        }else {
            int i1 = a.length() - b.length() - 1;
            int index=a.lastIndexOf('0', i1);
            if (index==-1){
                stringBuilder.insert(0,"0".repeat(a.length()-b.length()));
                stringBuilder.insert(0,'1');

            } else {
                for (int i = i1; i >=index ; i--) {
                    if (a.charAt(i)=='0'){
                        stringBuilder.insert(0,'1');
                    }else {
                        stringBuilder.insert(0,'0');
                    }
                }
                stringBuilder.insert(0,a.substring(0,index));

            }

        }
        return stringBuilder.toString();
    }
}
