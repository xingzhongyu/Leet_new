package leet592;

public class Solution {
    public String fractionAddition(String expression) {
        expression=expression.charAt(0)=='-'?"0/1"+expression:"0/1+"+expression;
        expression=expression.replace("-","+-");
        String[] strings=expression.split("[+]");
        int[][] nums=new int[strings.length][2];
        for (int i = 0; i <strings.length ; i++) {
            int location=strings[i].indexOf('/');
            nums[i][0]=Integer.parseInt(strings[i].substring(0,location));
            nums[i][1]=Integer.parseInt(strings[i].substring(location+1));


        }

        int x=nums[0][1];
        int y=0;
        for (int i = 1; i <strings.length ; i++) {
            int gcd=gcd(x,nums[i][1]);
            x=x*nums[i][1]/gcd;
        }
        for (int i = 0; i <strings.length ; i++) {
            nums[i][0]=nums[i][0]*x/nums[i][1];
            y+=nums[i][0];
        }


        if (y==0){
            return 0+"/"+1;
        }else {
            int gcd=Math.abs(gcd(y,x));
            return y/gcd+"/"+x/gcd;

        }
    }
    public int gcd(int num1,int num2){
        if (num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }

        int num;
        while (num1%num2!=0){
            num=num1%num2;

            num1=num2;
            num2=num;
        }
        return num2;
    }
}
