import java.util.*;
import java.io.*;
class Longestsubarry{
    public static void main(String args[]){
        int[]nums={1,2,1,0,1,1,0};
        int k=4;
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                maxlen=i+1;
            }
            if(map.containsKey(sum-k)){
                int len=i-map.get(sum-k);
                maxlen=Math.max(maxlen,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
            System.out.print(maxlen);
        
    }
}