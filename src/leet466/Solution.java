package leet466;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        Map<Integer,int[]> map=new HashMap<>();
        int s1cnt=0,s2cnt=0,index=0;
        int[] preLoop;
        int[] inLoop;
        while (true){
            ++s1cnt;
            for (int i = 0; i <s1.length() ; i++) {
                if (s1.charAt(i)==s2.charAt(index)){
                    index++;
                    if (index==s2.length()){
                            s2cnt++;
                            index=0;
                    }
                }

            }
            if (s1cnt==n1){
                return s2cnt/n2;
            }
            if (map.containsKey(index)){
                int[] value=map.get(index);
                int pres1=value[0];
                int pres2=value[1];

                preLoop=new int[]{pres1,pres2};
                    inLoop=new int[]{s1cnt-pres1,s2cnt-pres2};
                    break;
            }else {
                map.put(index,new int[]{s1cnt,s2cnt});
            }
        }
        int ans=preLoop[1]+(n1-preLoop[0])/inLoop[0]*inLoop[1];
        int rest=(n1-preLoop[0])%inLoop[0];
        for (int i = 0; i <rest ; i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j)==s2.charAt(index)){
                    index++;
                    if (index==s2.length()){
                        ans++;
                        index=0;
                    }
                }
            }
        }
        return ans/n2;
    }
}
