package leet443;

public class Solution {
    public int compress(char[] chars) {
       int write=0;
       int left=0;
       for (int read=0;read<chars.length;read++){
           if (read==chars.length-1||chars[read]!=chars[read+1]){
               chars[write++]=chars[read];
               int num=read-left+1;
               if (num>1){
                   int anchor=write;

                   while (num>0){


                       chars[write++]= (char) (num%10+'0');
                       num/=10;
                   }
                   reserve(chars,anchor,write-1);
               }
               left=read+1;
           }
       }
       return write;
    }
    public void reserve(char[] chars,int left,int right){
        while (left<right){

            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
    }
}