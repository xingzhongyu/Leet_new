package leet609;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> map=new HashMap<>();
        for (int i = 0; i < paths.length ; i++) {
            String string=paths[i];
            String[] strings=string.split(" ");

            String path=strings[0];
            for(int j=1;j<strings.length;j++){
                String s=strings[j];
                int location=s.indexOf('(');
                String content=s.substring(location+1,s.indexOf(')'));
                if (map.containsKey(content)){
                    List<String> list=map.get(content);
                    list.add(path+'/'+s.substring(0,location));
                }else {
                    List<String> list=new ArrayList<>();
                    list.add(path+'/'+s.substring(0,location));
                    map.put(content,list);
                }

            }

        }
        List<List<String>> ans=new ArrayList<>();
        for (String s: map.keySet()){
            List<String> list=map.get(s);
            if (list.size()>1){
                ans.add(list);
            }
        }
        return ans;
    }
}