package leet166;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long numeratorLong=numerator;
        long denominatorLong=denominator;
        Map<Long,Integer> map=new HashMap<>();
        int num=0;


        if (numeratorLong==0){
            return "0";
        }
        int sign=1;
        if (numeratorLong<0){
            sign=-sign;
            numeratorLong=-numeratorLong;
        }
        if (denominatorLong<0){
            sign=-sign;
            denominatorLong=-denominatorLong;
        }
        StringBuilder stringBuilder=new StringBuilder(numeratorLong/denominatorLong+"");

        if (numeratorLong%denominatorLong != 0) {
            stringBuilder.append('.');
            num=stringBuilder.length();
            numeratorLong = (numeratorLong % denominatorLong);
//            map.put(numeratorLong,num);
            while (numeratorLong != 0&&!map.containsKey(numeratorLong)) {


                    map.put(numeratorLong,num);
                    numeratorLong*=10;
                stringBuilder.append(numeratorLong/denominatorLong);


                    num++;



                numeratorLong=(numeratorLong%denominatorLong);

//                if (map.containsKey(numeratorLong)){
//                    int temp=map.get(numeratorLong);
//
//                    stringBuilder.insert(temp,"(");
//                    stringBuilder.append(')');
//                    return (sign==-1?"-":"")+ stringBuilder;
//                }


            }
            if (numeratorLong!=0){
                stringBuilder.insert(map.get(numeratorLong),"(");
                    stringBuilder.append(')');
                    return (sign==-1?"-":"")+ stringBuilder;
            }
        }
        return (sign==-1?"-":"")+ stringBuilder;

    }
}
