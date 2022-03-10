package leet306;

public class Solution {
    public boolean isAdditiveNumber(String num) {
        int n=num.length();
        for (int i = 1; i <n-1 ; i++) {//i为secondStart
            if (num.charAt(0)=='0'&&i!=1){
                break;
            }
            for (int j = i; j <n-1 ; j++) {//j为secondEnd
                if (num.charAt(i)=='0'&&i!=j){
                    break;

                }
                if (valid(i,j,num)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean valid(int secondStart,int secondEnd,String num){
        int firstStart=0;
        int firstEnd=secondStart-1;

        while (secondEnd<=num.length()-1){
            String third=add(num,firstStart,firstEnd,secondStart,secondEnd);
          int thirdStart=secondEnd+1;
          int thirdEnd=thirdStart+third.length()-1;
          if (thirdEnd>=num.length()||(!num.substring(thirdStart,thirdEnd+1).equals(third))){
              break;
          }
          if (thirdEnd==num.length()-1){
              return true;
          }
          firstStart=secondStart;
          firstEnd=secondEnd;
          secondStart=thirdStart;
          secondEnd=thirdEnd;
        }
        return false;

    }

    public String add(String num,int a1,int a2,int b1,int b2){
        StringBuilder stringBuilder=new StringBuilder();
        int carry=0;
        while (a2>=a1||b2>=b1||carry!=0){
            if (a2>=a1){
                carry+=num.charAt(a2)-'0';
                --a2;
            }
            if (b2>=b1){
                carry+=num.charAt(b2)-'0';
                b2--;
            }
            stringBuilder.append(carry%10);
            carry/=10;
        }
        return stringBuilder.reverse().toString();
    }
}