package leet557;

public class Solution {
    public String reverseWords(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        String[] strings=s.split(" ");
        for (int i = 0; i <strings.length ; i++) {
            String s1=strings[i];
            StringBuilder stringBuilder1=new StringBuilder(s1);
            String s2=stringBuilder1.reverse().toString();
            if (i>0){
            stringBuilder.append(" ");

            }
            stringBuilder.append(s2);

        }
return stringBuilder.toString();
    }

}