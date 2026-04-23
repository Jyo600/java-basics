import java.io.*;
import java.util.*;
class smallesrsubarraysumK{
    public static void main(String args[]){
        int[]nums={2,3,1,2,4,3};
        int sum=0;
        int k=7;
        int minlen=Integer.MAX_VALUE;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=k){
                minlen=Math.min(minlen,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(minlen==Integer.MAX_VALUE){
            minlen=0;
        }
        System.out.println(minlen);
    }
}