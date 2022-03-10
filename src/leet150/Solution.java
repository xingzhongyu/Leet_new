package leet150;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack=new Stack<>();
        for (int i = 0; i < tokens.length ; i++) {
            String s=tokens[i];
            if (s.equals("+")){
                int num1=Integer.parseInt(stack.pop());
                int num2=Integer.parseInt(stack.pop());



                stack.push(String.valueOf(num1+num2));
            }else if (s.equals("-")){
                int num1=Integer.parseInt(stack.pop());
                int num2=Integer.parseInt(stack.pop());
                stack.push(String.valueOf(num2-num1));
            }else if (s.equals("*")){
                int num1=Integer.parseInt(stack.pop());
                int num2=Integer.parseInt(stack.pop());
                stack.push(String.valueOf(num1*num2));
            }else if (s.equals("/")){
                int num1=Integer.parseInt(stack.pop());
                int num2=Integer.parseInt(stack.pop());
                stack.push(String.valueOf(num2/num1));
            }else {
                stack.push(s);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
