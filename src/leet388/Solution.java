package leet388;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int lengthLongestPath(String input) {
        int max=0;
        String[] strings=input.split("\n");
        Stack<String> stack=new Stack<>();
        for (int i = 0; i <strings.length ; i++) {
            String s=strings[i];
            int floor=0;



            if (!s.equals("")){
//                for (int j = 0; j <s.length() ; j++) {
//                    if (s.charAt(j)=='\t'){
//                        floor++;
//                    }else {
//                        break;
//                    }
//
//                }
                floor=s.lastIndexOf('\t')+1;
                s=s.substring(floor);
                if (floor<stack.size()){
                    for (int j = stack.size()-floor; j >0 ; j--) {
                        stack.pop();
                    }
                }



                stack.push(s);



                if (s.contains(".")){
                    List<String> list= Arrays.asList(stack.toArray(new String[0]));
//                    for (String s1:stack){
//                        length+=s1.length();
//                    }
                    max=Math.max(max,String.join("/",list).length());
                }
            }
        }
        return max;
    }
}
