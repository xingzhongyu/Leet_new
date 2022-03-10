package leet20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        char[] chars=new char[]{ '(',')','{','}','[',']'};
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c1=s.charAt(i);
            if (c1==chars[0]||c1==chars[2]||c1==chars[4]){




                stack.push(c1);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                char c2=stack.pop();
                if (c1==chars[1]&&c2!=chars[0]){
                    return false;
                }
                if (c1==chars[3]&&c2!=chars[2]){
                    return false;
                }
                if (c1==chars[5]&&c2!=chars[4]){
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
