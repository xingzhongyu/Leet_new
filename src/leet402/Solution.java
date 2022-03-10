package leet402;

import java.util.Stack;

public class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder ans=new StringBuilder();
        if (num.length()<=k){
            return "0";
        }
        for (int i = 0; i <num.length() ; i++) {
            while (k>0&&!ans.isEmpty()&&ans.charAt(ans.length()-1)>num.charAt(i)){

                ans.deleteCharAt(ans.length()-1);
                k--;
            }

            if (!(ans.isEmpty()&&num.charAt(i)=='0')){
                ans.append(num.charAt(i));
            }
        }
        if (ans.isEmpty()){
            return "0";
        }else {
            if (k>0){
                if (ans.length()>k){
                    return ans.substring(0,ans.length()-k);
                }else {
                    return "0";
                }
            }else {

                return ans.toString();
            }
        }
    }
}
