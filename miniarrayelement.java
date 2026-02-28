import java.io.*;
import java.util.*;
class miniarrayelement{
    public static void main(String srgs[]){
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]ar=new int[n];
       System.out.println(" enter the array element");
       for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
       }
       //find minimum element in array
       int min=ar[0];
       for(int i=0;i<n;i++){
        if(ar[i]<min){
            min=ar[i];
        }
       }
       System.out.println(min);
    }
}