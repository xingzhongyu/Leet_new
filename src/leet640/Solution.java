package leet640;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {
    public String solveEquation(String equation) {
        int location=equation.indexOf('=');
        String left=equation.substring(0,location);
        String right=equation.substring(location+1);
        int[] nums1=handle(left);
        int[] nums2=handle(right);

        nums1[0]=nums1[0]-nums2[0];
        nums1[1]=nums2[1]-nums1[1];
        if (nums1[0]==0){
            if (nums1[1]==0){
                return "Infinite solutions";
            }else {
                return "No solution";
            }
        }
        return "x="+nums1[1]/nums1[0];

    }

    public int[] handle(String s){
        int[] nums=new int[2];
        if (s.charAt(0)!='-'){
            s='+'+s;

        }
        List<Character> characters=new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='+'||s.charAt(i)=='-'){
                characters.add(s.charAt(i));
            }
        }
        int i=0;
        String[] strings=s.split("[+-]");
       for (String s1:s.split("[+-]")){
           if (!Objects.equals(s1, "")){

               if (s1.charAt(s1.length()-1)=='x'){
                   int num;
                   if (s1.length()==1){
                       num=1;
                   }else {
                       num=Integer.parseInt(s1.substring(0,s1.length()-1));
                   }

                   if (characters.get(i++)=='+'){
                       nums[0]+=num;
                   }else {
                       nums[0]-=num;
                   }
               }else {
                   int num=Integer.parseInt(s1);
                   if (characters.get(i++)=='+'){
                       nums[1]+=num;
                   }else {
                       nums[1]-=num;
                   }
               }
           }
       }

       return nums;
    }
}