package leet12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    class T{
        public T(int num, String string) {
            this.num = num;
            this.string = string;
        }

        int num;
        String string;
    }
    public String intToRoman(int num) {
        StringBuilder stringBuilder=new StringBuilder();

        int M=num/1000;
        stringBuilder.append("M".repeat(Math.max(0, M)));
        num=num%1000;

        List<T> ts=new ArrayList<>();
        ts.add(new T(900,"CM"));
        ts.add(new T(500,"D"));
        ts.add(new T(400,"CD"));
        ts.add(new T(100,"C"));
        ts.add(new T(90,"XC"));
        ts.add(new T(50,"L"));
        ts.add(new T(40,"XL"));
        ts.add(new T(10,"X"));
        ts.add(new T(9,"IX"));
        ts.add(new T(5,"V"));
        ts.add(new T(4,"IV"));
        ts.add(new T(1,"I"));
        while (num>0){
            for (T t:ts){
                if (t.num<=num){
                    stringBuilder.append(t.string.repeat(num/t.num));
                    num=num%t.num;
                }
            }
        }
        return stringBuilder.toString();
    }
}
