package leet43;

public class Solution {
    StringBuilder stringBuilder;
    public String multiply(String num1, String num2) {
        if("0".equals(num1)||"0".equals(num2)){
            return "0";
        }
        String ans="";
        String[] strings=new String[10];
        strings[0]="0";
        for (int i = num2.length()-1; i >=0 ; i--) {

            int x=num2.charAt(i)-'0';
            String s="";
            if (strings[x]!=null){

                s=strings[x];
            }else {
                for (int j = 0; j < x; j++) {
                    s=add(s,num1);
                }
                strings[x]=s;
            }
            s=s+"0".repeat(num2.length()-i-1);
            ans=add(s,ans);
        }
        return ans;
    }

    public String add(String num1,String num2){
        stringBuilder=new StringBuilder();
        int carry=0;
        int n=Math.max(num1.length(),num2.length());
        for (int i = 0; i < n; i++) {
            int x=(num1.length()-i-1)>=0?num1.charAt(num1.length()-i-1)-'0':0;
            int y=(num2.length()-i-1>=0)?num2.charAt(num2.length()-i-1)-'0':0;
            carry+=x+y;
            stringBuilder.append(carry%10);
            carry/=10;
        }
        if (carry>0){
            stringBuilder.append(carry);
        }
        return stringBuilder.reverse().toString();
    }



}

