package leet71;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        String[] strings=path.split("/");
        List<String> list=new ArrayList<>();
        for (int i = 0; i <strings.length ; i++) {
            String s=strings[i];



            if ((!s.equals("."))&&(!s.equals(""))){
                if (s.equals("..")){
                    if (!list.isEmpty()){



                        list.remove(list.size()-1);
                    }
                }else {
                    list.add(s);
                }
            }
        }
//        StringBuilder stringBuilder=new StringBuilder("/");
//        if (list.isEmpty()){
//            return "/";
//        }

        return "/"+String.join("/", list);
    }
}

