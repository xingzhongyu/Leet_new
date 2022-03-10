package leet227;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution {
    public int calculate(String s) {
        Deque<Integer> deque=new ArrayDeque<>();
        Deque<Character> deque1=new ArrayDeque<>();
        if (s.charAt(0)=='-'){
            s="0"+s;
        }
        for (int i=0;i<s.length();i++){



            char c=s.charAt(i);
            if (c=='+'||c=='-'){
                deque1.addLast(c);



            }else if (c=='*'||c=='/'){
                int num1=deque.pollLast();
                int index=1;
                i++;
                while ((i+index)<s.length()){
                    char c1=s.charAt(i+index);
                    if (Character.isDigit(c1)||c1==' '){
                        index++;
                    }else {
                        break;
                    }
                }
                String s1=s.substring(i,i+index);

                int num2=Integer.parseInt(s1.trim());
                switch (c) {
                    case '*' -> deque.addLast(num1 * num2);
                    case '/' -> deque.addLast(num1 / num2);
                }


                i+=(index-1);


            }else {
                int index=1;

                while ((i+index)<s.length()){
                    char c1=s.charAt(i+index);
                    if (Character.isDigit(c1)||c1==' '){
                        index++;
                    }else {
                        break;
                    }

                }
                String s1=s.substring(i,i+index);
                deque.addLast((Integer.parseInt(s1.trim())));
                i+=(index-1);
            }
        }
        while (!deque1.isEmpty()){
            char c=deque1.poll();
            int num1=deque.poll();
            int num2=deque.poll();
            if (c=='+'){
                deque.addFirst(num1+num2);
            }else if (c=='-'){

                deque.addFirst(num1-num2);
            }
        }
        return deque.pop();
    }
}
