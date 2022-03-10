package leet412;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> strings=new ArrayList<>();
        String s="FizzBuzz";
        String s1="Fizz";
        String s2="Buzz";
        for (int i = 0; i <n ; i++) {
            int j=i+1;
            if (j%3==0&&j%5==0){

                strings.add(s);
            }else if (j%3==0){
                strings.add(s1);
            }else if (j%5==0){
                strings.add(s2);
            }else {
                strings.add(""+j);
            }
        }
        return strings;




    }
}
