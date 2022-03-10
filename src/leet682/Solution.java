package leet682;

import java.util.Stack;

public class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        for (String s : ops) {
            switch (s) {
                case "C" -> stack.pop();
                case "D" -> stack.push(stack.peek() * 2);
                case "+" -> {
                    int a1 = stack.pop();
                    int a2 = stack.peek();
                    stack.push(a1);
                    stack.push(a1 + a2);
                }
                default -> stack.push(Integer.parseInt(s));
            }

        }
        int num=0;
        while (!stack.isEmpty()){
            num+=stack.pop();
        }
        return num;
    }
}