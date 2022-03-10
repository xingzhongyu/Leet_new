package leet482;

public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder stringBuilder=new StringBuilder();
        s=s.replace("-","");
        s=s.toUpperCase();
        for (int i = s.length()-1; i >=0 ; i--) {
            stringBuilder.append(s.charAt(i));
            if ((s.length()-i)%k==0&&i!=0){
                stringBuilder.append('-');
            }

        }
        return stringBuilder.reverse().toString();
    }
}
