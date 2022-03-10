package leet38;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class Solution {
    static class T{
        int num;
        int location;
    }

    public String countAndSay(int n) {
        List<T> ts=new ArrayList<>();
        Integer before=null;
        List<Integer> last=new ArrayList<>();
        last.add(1);

        for (int i = 0; i <n-1 ; i++) {
            T t=null;
            for (Integer integer:last){
                if (before==null|| !before.equals(integer)){
                    t= new T();
                    t.num=1;
                    t.location=integer;
                    before=integer;
                    ts.add(t);
                }else {
                    t.num++;
                }
            }
            before=null;
            last.clear();
            for (T t1:ts){
              last.add(t1.num);
              last.add(t1.location);
            }
            ts.clear();

        }
        StringBuilder stringBuilder=new StringBuilder();
        for (Integer integer:last){

            stringBuilder.append(integer);
        }
        return stringBuilder.toString();


    }
}
