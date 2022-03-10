package leet492;

public class Solution {
    public int[] constructRectangle(int area) {

        for (int i = (int) Math.ceil(Math.sqrt(area)); i <=area ; i++) {

                if (area%i==0){
                    return new int[]{i,area/i};
                }





        }
        return new int[]{area,1};
    }




}
