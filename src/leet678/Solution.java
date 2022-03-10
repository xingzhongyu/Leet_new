package leet678;

import java.util.Stack;

public class Solution {
    public boolean checkValidString(String s) {
        int num1=0;
        int num2=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='('){
                num1++;
            }else if (s.charAt(i)==')'){

                if (num1==0&&num2==0){
                    return false;
                }else if (num1==0){
                    num2--;
                }else {
                    num1--;
                }
            }else if (s.charAt(i)=='*'){
                num2++;
            }
        }
        num1=0;
        num2=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)==')'){
                num1++;
            }else if (s.charAt(i)=='('){
                if (num1==0&&num2==0){
                    return false;
                }else if (num1==0){
                    num2--;
                }else {
                    num1--;
                }
            }else if (s.charAt(i)=='*'){
                num2++;
            }
        }
        return true;
    }


}
