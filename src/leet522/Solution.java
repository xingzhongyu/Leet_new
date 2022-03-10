package leet522;

import java.util.*;

public class Solution {
    public int findLUSlength(String[] strs) {
//        List<String> list = new ArrayList<>();
        int ans=-1;
        for (int i=0;i<strs.length;i++) {
//            if (list.contains(s)){
//                list.remove(s);
//            }else {

            boolean in = false;
            String s=strs[i];
            for (int j=0;j<strs.length;j++) {
                String s1=strs[j];
                if (i!=j&&s.length() <= s1.length()) {
                    int location = 0;
                    for (int k = 0; k < s1.length()&&location<s.length(); k++) {
                        if (s1.charAt(k) == s.charAt(location)) {
                            location++;
//                            if (location==s.length()){
//                                in=true;
//                                break;
//
//                            }
                        }

                    }
                    if (location==s.length()){
                        in=true;
                        break;
                    }

                }



            }
            if (!in) {
                ans=Math.max(ans,s.length());
            }

//            }
        }
//        if (list.isEmpty()) {
//            return -1;
//        }
//        list.sort((o1, o2) -> o2.length() - o1.length());
        return ans;



    }
}
