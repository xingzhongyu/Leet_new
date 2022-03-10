package leet49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        for (int i = 0; i <strs.length ; i++) {
          if (!strs[i].equals("0")){
              char[] chars=strs[i].toCharArray();
              Arrays.sort(chars);

              List<String> list=new ArrayList<>();
              list.add(strs[i]);
              ans.add(list);


              for (int j = i+1; j <strs.length ; j++) {
                  if (strs[i].length() == strs[j].length()) {
                     char[] chars1=strs[j].toCharArray();
                     Arrays.sort(chars1);
                     if (Arrays.equals(chars,chars1)){
                         list.add(strs[j]);
                         strs[j]="0";

                     }
                  }
              }
              strs[i]="0";
          }
        }
        return ans;
    }
}
