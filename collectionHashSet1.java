//all operations in hashSet
import java.io.*;
import java.util.*;
class collectionHashSet1{
      public static void main(String[]args){
    int[]arr={1,2,3,4,4,5,6,6};
   HashSet<Integer> set=new HashSet<>();
//add()
       set.add(10);
      set.add(20);
       set.add(30);
int count=0;
//add multiple element Collections.addAll()
      Collections.addAll(set,11,2,34,56);
System.out.println(set);
//remove()
      set.remove(11);
        System.out.println(set);
//contains()
        boolean result=set.contains(90);
       System.out.println(result);
    System.out.println(set.size());
     System.out.println(set.isEmpty());
    // set.clear();
      // System.out.println(set);
   //for each loop inhanced loop
for(int num:arr){
   set.add(num);
count++;
 }
System.out.println(set+" "+count);
//convert to array

Object[]arr1=set.toArray();

System.out.println(set+" ");

    
     }
  }