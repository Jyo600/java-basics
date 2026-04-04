import java.util.*;
import java.io.*;
class frequencycheck{
    public static void main(String args[]){
        int[]nums={1,2,2,3};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
           map.put(num,map.getOrDefault(num,0)+1);
            
         }
        // System.out.println(map);
        for(int num:nums){
       if(map.get(num)==1){
        System.out.println(num);
       }
    }
       
    }
}