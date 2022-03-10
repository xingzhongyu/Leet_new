package leet168;

public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder=new StringBuilder();
        while (columnNumber>0){
            int num=(columnNumber-1)%26;
            stringBuilder.append((char) (num+'A'));
            columnNumber=(columnNumber-1)/26;
        }
        return stringBuilder.reverse().toString();
    }




}