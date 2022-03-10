package leet392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length()==0){
            return true;
        }
        int location=0;
        for (int i = 0; i <t.length() ; i++) {
            if (t.charAt(i)==s.charAt(location)){
                location++;
                if (location==s.length()){

                    return true;
                }
            }

        }

        return false;
    }

}

