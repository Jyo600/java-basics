import java.io.*;
import java.util.*;
class largestelement{
    public static void main(String args[]){
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]ar=new int[n];
        System.out.println("Enter the array element:");
         for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
         }
         //finding the largest element in array
         int largest=ar[0];
         for(int i=0;i<n;i++){
           
        if(ar[i]>largest)
        {
            largest=ar[i];
        }
    }
    System.out.println(largest);
}
}