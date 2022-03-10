package leet686;

public class Solution {
    public int repeatedStringMatch(String a, String b) {
        if (b.length()==0){
            return 0;
        }
        if(b.length()<a.length()){
            if (a.contains(b)){
                return 1;
            }else if ((a+a).contains(b)){
                return 2;

            }
            return -1;

        }
        int ans= (int) Math.ceil(((double) b.length()-a.length())/a.length())+1;

        String s=a.repeat(ans);

        if (s.contains(b)){
            return ans;
        }
        s=s+a;
        if (s.contains(b)){
            return ans+1;
        }
        return -1;
    }
}