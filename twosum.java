import java.io.*;
import java.util.*;
class twosum{
   public static int[]twosum(int[]nums,int target){
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
        }
    }
    return new  int[]{};


    }
    public static void main(String args[]){
        int[]nums={11,17,2,7};
        int target=9;
        int[] result= twosum(nums,target);
        System.out.println("the indices are" +result[0]+ "second indices is" +result[1]);

    }
}