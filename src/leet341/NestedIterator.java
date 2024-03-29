package leet341;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// This is the interface that allows for creating nested lists.
  // You should not implement it, or speculate about its implementation
interface NestedInteger {
 
      // @return true if this NestedInteger holds a single integer, rather than a nested list.
      public boolean isInteger();
 
      // @return the single integer that this NestedInteger holds, if it holds a single integer
      // Return null if this NestedInteger holds a nested list
      public Integer getInteger();
 
      // @return the nested list that this NestedInteger holds, if it holds a nested list
      // Return empty list if this NestedInteger holds a single integer
      public List<NestedInteger> getList();
  }


public class NestedIterator implements Iterator<Integer> {
    List<Integer> list=new ArrayList<>();
    public NestedIterator(List<NestedInteger> nestedList) {
            Ini(nestedList);
    }
    public void Ini(List<NestedInteger> nestedIntegers){
        for (NestedInteger nestedInteger:nestedIntegers){
            if (nestedInteger.isInteger()){
                list.add(nestedInteger.getInteger());
            }else {
                Ini(nestedInteger.getList());
            }
        }
    }
    @Override
    public Integer next() {
        return list.remove(0);
    }

    @Override
    public boolean hasNext() {
        return !list.isEmpty();
    }
}


//  Your NestedIterator object will be instantiated and called as such:
//  NestedIterator i = new NestedIterator(nestedList);
//  while (i.hasNext()) v[f()] = i.next();





