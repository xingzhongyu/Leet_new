package leet394;

public class Solution {
    char[] chars;
    int cur=0;
    public String decodeString(String s) {
        chars=s.toCharArray();
        return getString().toString();
    }
    public StringBuilder getString(){
        int num=0;
        StringBuilder stringBuilder=new StringBuilder();



        while (cur< chars.length){
            if (Character.isDigit(chars[cur])){
                num=num*10+chars[cur]-'0';
                cur++;
            }else if (chars[cur]=='['){
                cur++;
                stringBuilder.append(getString().toString().repeat(num));
                num=0;
            }else if (chars[cur]==']'){
                cur++;
                break;
            }else {
                stringBuilder.append(chars[cur]);
                cur++;
            }
        }
        return stringBuilder;

                }
}