package leet8;

import java.math.BigDecimal;

public class Solution {
    public int myAtoi(String s) {

        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        char c=s.charAt(0);
        if (c=='+'||c=='-'||(c>='0'&&c<='9')){

            int location=1;
            while (location<s.length()){
                if (!Character.isDigit(s.charAt(location))){


                        break;





                }

                location++;
            }
            if (location==1&&(c=='+'||c=='-')){
                return 0;
            }

            if (location<s.length()){
                s=s.substring(0,location);
            }
        }else {
            return 0;
        }
        BigDecimal bigDecimal=new BigDecimal(s);
        if (bigDecimal.compareTo(new BigDecimal(String.valueOf(Integer.MAX_VALUE)))>0){
            return Integer.MAX_VALUE;
        }else if (bigDecimal.compareTo(new BigDecimal(String.valueOf(Integer.MIN_VALUE)))<0){
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(s);
    }
}


