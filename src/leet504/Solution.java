package leet504;

public class Solution {
    public String convertToBase7(int num) {
        boolean bool=true;
        if (num==0){
            return "0";
        }
        StringBuilder stringBuilder=new StringBuilder();
        if (num<0){
            bool=false;
            num=-1*num;


        }
        while (num!=0){
            stringBuilder.append(num%7);

            num/=7;



        }
        return (bool?"":"-")+ stringBuilder.reverse();
    }
}
