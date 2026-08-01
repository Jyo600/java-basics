import java.io.*;
import java.util.*;
class mergrSortedArray{
   public static void main(String[]args){
      int[]ar1={1,2,3,0,0,0};
      int[]ar2={2,5,6};
        int m=3;
         int n=3;
       int i=m-1;
       int j=n-1;
       int k=m+n-1;
        while(j>=0){
           if(i>=0 && ar1[i]>ar2[j]){
               ar1[k]=ar1[i];
                
                i--;
             }
               else{
                      ar1[k]=ar2[j];
                      
                       j--;
                        }
                    k--;
         }
           for(int num:ar1){
              System.out.println(num+" ");
           }
    }
 }