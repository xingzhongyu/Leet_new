package leet165;

public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] strings1=version1.split("\\.");
        String[] strings2=version2.split("\\.");
        int location=0;
        while (location<Math.min(strings1.length,strings2.length)){
            int i1=Integer.parseInt(strings1[location]);
            int i2=Integer.parseInt(strings2[location]);
            if (i1>i2){
                return 1;
            }
            if (i1<i2){
                return -1;
            }
            location++;
        }

        while (location<strings1.length){
            if (Integer.parseInt(strings1[location])>0){
                return 1;
            }
            location++;
        }

        while (location<strings2.length){
            if (Integer.parseInt(strings2[location])>0){
                return -1;

            }
            location++;
        }


        return 0;
    }
}
