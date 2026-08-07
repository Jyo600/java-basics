import java.io.*;
import java.util.*;
class removelement{
      public static void main(String[]args){
        int[]arr={1,2,3,4,2,2,0};
       int val=2;
        int index=0;
       for(int i=0;i<arr.length;i++){
          if(arr[i]!=val){
                 arr[index]=arr[i];
                index++;
           }
        //System.out.print(arr[index]+" ");
    
       }
          System.out.println(index+" ");
          for(int k=0;k<index;k++){
           System.out.print(arr[k]+" ");
         }
     }
  }