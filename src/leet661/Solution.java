package leet661;

public class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] ans=new int[img.length+2][img[0].length+2];
        for (int i = 0; i < img.length ; i++) {
            System.arraycopy(img[i], 0, ans[i + 1], 1, img[i].length);
        }
        for (int i = 1; i < ans.length-1; i++) {

            for (int j = 1; j < ans[i].length-1; j++) {
                int Ii=i-1;
                int Ij=j-1;
                int sum=ans[i-1][j-1]+ ans[i-1][j]+ans[i-1][j+1]+ans[i][j-1]+ans[i][j]+ans[i][j+1]+ans[i+1][j-1]+ans[i+1][j]+ans[i+1][j+1];
                if ((Ii==0||Ii==img.length-1)&&(Ij==0||Ij==img[Ii].length-1)){
                    if (img.length>1&&img[Ii].length>1){
                        img[Ii][Ij]=sum/4;
                    }else if (img.length==1&&img[Ii].length==1){
                        img[Ii][Ij] = sum ;

                    }else {
                        img[Ii][Ij]=sum/2;
                    }

                } else if ((Ii==0||Ii==img.length-1)||(Ij==0||Ij==img[Ii].length-1)){
                    if (img.length==1||img[Ii].length==1){
                        img[Ii][Ij]=sum/3;
                    }else {
                        img[Ii][Ij]=sum/6;

                    }
                }else {
                    img[Ii][Ij]=sum/9;
                }


            }

        }
        return img;
    }
}
