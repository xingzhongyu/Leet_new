package leet405;

public class Solution {
    public String toHex(int num) {
        StringBuilder stringBuilder=new StringBuilder();
        if (num==0){
            return "0";
        }
        while (num!=0&&stringBuilder.length()<8){
            int a=(num&15);
            if (a<10){
                stringBuilder.append(a);



            }else {
                stringBuilder.append((char) ((a - 10)+'a'));








            }
            num=num>>4;
        }

        return stringBuilder.reverse().toString();
    }
}