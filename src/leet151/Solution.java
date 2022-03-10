package leet151;

public class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] strings=s.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = strings.length-1; i >=0; i--) {
            if (strings[i].charAt(0)!=' '){
                if (i<strings.length-1){
                    stringBuilder.append(" ");
                }
//            StringBuilder stringBuilder1=new StringBuilder(strings[i]);

                stringBuilder.append(strings[i]);
            }

        }
        return stringBuilder.toString();
    }
}