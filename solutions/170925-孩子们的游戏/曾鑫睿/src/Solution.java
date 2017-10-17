public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0)
            return -1;
        int[] a=new int[n];
        int len=n;
        for(int i=0; i<a.length; i++) {
            a[i]=i;
        }
        int i=0;
        int j=1;//要报的数
        int k=0;//出圈人数
        while(len>0) {
            if(a[i%n]>-1) {
                if(j%m==0) {
                    k++;
                    if(k==n) {
                        k=a[i%n];
                    }
                    a[i%n]=-1;//将出圈后的相应位置上置-1。
                    j=1;//重新报数
                    i++;
                    len--;//圈中人数减1。
                } else {
                    //m
                    i++;
                    j++;
                }
            } else {
                //已出圈的人
                i++;
            }
        }
        return k;
    }
}