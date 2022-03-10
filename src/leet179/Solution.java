package leet179;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder stringBuilder=new StringBuilder();
        List<String> list=new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            list.add(String.valueOf(nums[i]));
        }

        String max=null;
        int index=0;
        boolean ini=true;
        while (!list.isEmpty()){
            if (max==null){
                max=list.get(index);
            }else {
                String s=list.get(index);
                String s1=s+max;
                String s2=max+s;
                char c1;
                char c2;
                for (int i = 0; i <s1.length() ; i++) {
                    c1=s1.charAt(i);
                    c2=s2.charAt(i);
                    if (c1>c2){
                        max=s;
                        break;
                    }else if (c1<c2){
                        break;
                    }
                }
            }
            index++;
            if (index==list.size()){
                if (ini&&max.equals("0")){
                    return "0";
                }
                ini=false;

                stringBuilder.append(max);
                list.remove(max);

                max=null;
                index=0;
            }
        }
        return stringBuilder.toString();
    }



}
