package leet385;


import java.util.List;
import java.util.Stack;

// This is the interface that allows for creating nested lists.
  // You should not implement it, or speculate about its implementation
class NestedInteger {//替换测试用，无实际意义
      // Constructor initializes an empty nested list.
      public NestedInteger(){

      };

      // Constructor initializes a single integer.
      public NestedInteger(int value){

      };

      // @return true if this NestedInteger holds a single integer, rather than a nested list.
      public boolean isInteger(){
          return true;
      }

      // @return the single integer that this NestedInteger holds, if it holds a single integer
      // Return null if this NestedInteger holds a nested list
      public Integer getInteger(){
          return 0;
      }

      // Set this NestedInteger to hold a single integer.
      public void setInteger(int value){

      }

      // Set this NestedInteger to hold a nested list and adds a nested integer to it.
      public void add(NestedInteger ni){

      }

      // @return the nested list that this NestedInteger holds, if it holds a nested list
      // Return empty list if this NestedInteger holds a single integer
      public List<NestedInteger> getList(){
          return null;
      }
  }

class Solution {

    char[] chars;
    int cur=0;
    public NestedInteger deserialize(String s) {
        if (s.charAt(0)!='['){
            return new NestedInteger(Integer.parseInt(s));
        }

        chars=s.toCharArray();
        return getNest();
    }
    public NestedInteger getNest(){
        int num=0;
        NestedInteger nestedInteger=new NestedInteger();
        int sign=1;
        while (cur< chars.length){
            cur++;

            if (chars[cur]==','){
                continue;
            }
            if (chars[cur]=='['){
                nestedInteger.add(getNest());
            }
            else if (chars[cur]==']'){
                return nestedInteger;
            }
            else if (chars[cur]=='-'){
                sign=-1;
            }else {
                num=num*10+sign*(chars[cur]-'0');
                if (chars[cur+1]==','||chars[cur+1]==']'){
                    nestedInteger.add(new NestedInteger(num));
                    num=0;
                    sign=1;
                }
            }
        }
        return null;
    }
}
