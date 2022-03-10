package leet321;

public class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m=nums1.length,n= nums2.length;
        int[] maxS=new int[k];
        int start=Math.max(0,k-n),end=Math.min(k,m);
        for (int i = start; i <=end; i++) {
            int[] s1=maxS(nums1,i);
            int[] s2=maxS(nums2,k-i);
            int[] currS=merge(s1,s2);
            if (compare(currS,0,maxS,0)>0){

                System.arraycopy(currS,0,maxS,0,k);
            }
        }
        return maxS;
    }
    public int compare(int[] a1,int index1,int[] a2,int index2){

        int x=a1.length,y=a2.length;
        while (index1<x&&index2<y){
            int diff=a1[index1]-a2[index2];
            if (diff!=0){
                return diff;
            }
            index1++;
            index2++;
        }
        return (x-index1)-(y-index2);
    }
    public int[] merge(int[] a1,int[] a2){
        int x=a1.length;
        int y= a2.length;
        if (x==0){
            return a2;

        }
        if (y==0){
            return a1;
        }
        int length=x+y;
        int[] ans=new int[length];

        int index1=0,index2=0;
        for (int i = 0; i <length ; i++) {
            if (compare(a1,index1,a2,index2)>0){
                ans[i]=a1[index1++];
            }else {
                ans[i]=a2[index2++];
            }
        }
    return ans;
    }
    public int[] maxS(int[] nums,int k){
        int [] stack=new int[k];
        int top=-1;
        int n= nums.length;
        int remain= n-k;
        for (int i = 0; i <n ; i++) {
            int num=nums[i];
            while (top>=0&&stack[top]<num&&remain>0){
                top--;
                remain--;
            }
            if (top<k-1){
                stack[++top]=num;
            }else {
                remain--;
            }
        }
        return stack;
    }
}